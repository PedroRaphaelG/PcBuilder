package main.java.ui;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import main.java.builder.CustomPCBuilder;
import main.java.catalog.ComponentCatalog;
import main.java.factory.PreBuiltPCFactory;
import main.java.model.Component;
import main.java.model.ComponentType;
import main.java.model.Computer;

public class PCBuilderMenu {
    public static void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        CustomPCBuilder builder = new CustomPCBuilder();

        boolean montando = true;

        while (montando) {
            System.out.println("\n1. Adicionar/Trocar Peça");
            System.out.println("2. Ver Configuração Atual");
            System.out.println("3. Finalizar Montagem");
            System.out.println("4. Escolher PC Pronto");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa o buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    escolherPeca(scanner, builder);
                    break;
                case 2:
                    builder.getComputer().showConfiguration();
                    break;
                case 3:
                    System.out.println("Montagem finalizada!");
                    builder.getComputer().showConfiguration();

                    boolean respostaValida = false;
                    while (!respostaValida) {
                        System.out.println("Deseja montar outro PC?");
                        System.out.println("1. Sim");
                        System.out.println("2. Não (finalizar programa)");
                        System.out.print("Escolha uma opção: ");
                        int escolhaFinalizar = -1;

                        try {
                            escolhaFinalizar = scanner.nextInt();
                            if (escolhaFinalizar == 1) {
                                respostaValida = true;
                                builder = new CustomPCBuilder(); // reinicia builder para nova montagem
                            } else if (escolhaFinalizar == 2) {
                                respostaValida = true;
                                montando = false; // termina o loop principal e finaliza programa
                            } else {
                                System.out.println("Opção inválida. Tente novamente.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor, digite um número.");
                            scanner.nextLine(); // limpar buffer
                        }
                    }
                    break;
                case 4:
                    Computer pcPronto = mostrarPCsProntos(scanner);
                    builder.setComputer(pcPronto); // Corrige: salva o PC pronto no builder
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
        System.out.println("Obrigado por comprar conosco, volte sempre!!");
    }

    private static void escolherPeca(Scanner scanner, CustomPCBuilder builder) {
        List<Component> catalogo = ComponentCatalog.getAllComponents();

        for (ComponentType tipo : ComponentType.values()) {
            System.out.println("\n" + tipo + ":");
            List<Component> doTipo = catalogo.stream()
                    .filter(c -> c.getType() == tipo)
                    .collect(Collectors.toList());

            for (int i = 0; i < doTipo.size(); i++) {
                System.out.println((i + 1) + ". " + doTipo.get(i));
            }

            int escolha = -1;
            while (true) {
                System.out.print("Escolha uma opção (ou 0 para pular): ");
                try {
                    escolha = scanner.nextInt();
                    if (escolha >= 0 && escolha <= doTipo.size()) {
                        break;
                    } else {
                        System.out.println("Número fora do intervalo. Tente novamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    scanner.nextLine(); // Limpa o buffer
                }
            }

            if (escolha > 0) {
                builder.addComponent(doTipo.get(escolha - 1));
                System.out.println("Peça adicionada com sucesso!");
            }
        }
    }

    // Agora retorna o PC selecionado
    private static Computer mostrarPCsProntos(Scanner scanner) {
        int opcao = -1;

        while (true) {
            System.out.println("\nEscolha um PC pronto:");
            System.out.println("1. Iniciante");
            System.out.println("2. Intermediário");
            System.out.println("3. Avançado");
            System.out.println("4. Gamer");
            System.out.print("Digite sua opção: ");

            try {
                opcao = scanner.nextInt();
                if (opcao >= 1 && opcao <= 4) {
                    break;
                } else {
                    System.out.println("Opção fora do intervalo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa o buffer
            }
        }

        Computer pc = null;
        switch (opcao) {
            case 1:
                pc = PreBuiltPCFactory.criarPCIniciante();
                break;
            case 2:
                pc = PreBuiltPCFactory.criarPCIntermediario();
                break;
            case 3:
                pc = PreBuiltPCFactory.criarPCAvancado();
                break;
            case 4:
                pc = PreBuiltPCFactory.criarPCGamer();
                break;
        }

        System.out.println("Configuração do PC pronto selecionado:");
        pc.showConfiguration();
        return pc;
    }
}

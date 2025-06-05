import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Component> components = new ArrayList<>();
    private final double custoMontagem = 150.00;

    public void addComponent(Component component) {
        components.add(component);
    }

    public void showConfiguration() {
        System.out.println("==== Configuração do Computador ====");
        for (Component c : components) {
            System.out.println(c.getType() + ": " + c);
        }
        System.out.println("Custo total das peças: R$ " + getTotalPriceSemMontagem());
        System.out.println("Custo da montagem: R$ " + custoMontagem);
        System.out.println("Valor final: R$ " + getTotalPrice());
        System.out.println("====================================");
    }

    public double getTotalPriceSemMontagem() {
        return components.stream().mapToDouble(Component::getPrice).sum();
    }

    public double getTotalPrice() {
        return getTotalPriceSemMontagem() + custoMontagem;
    }
}

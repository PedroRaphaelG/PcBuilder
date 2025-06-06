package main.java.factory;

import main.java.model.Component;
import main.java.model.Computer;
import main.java.model.ComponentType;
import main.java.builder.CustomPCBuilder;

public class PreBuiltPCFactory {
    public static Computer criarPCIniciante() {
        return new CustomPCBuilder()
            .addComponent(new Component(ComponentType.PROCESSADOR, "Intel Celeron G5900", 300.00))
            .addComponent(new Component(ComponentType.MEMORIA, "4GB DDR4", 150.00))
            .addComponent(new Component(ComponentType.ARMAZENAMENTO, "HDD 500GB", 200.00))
            .addComponent(new Component(ComponentType.FONTE, "Fonte 300W", 100.00))
            .addComponent(new Component(ComponentType.PLACA_MAE, "Placa-Mãe Básica", 250.00))
            .addComponent(new Component(ComponentType.GABINETE, "Gabinete Simples", 100.00))
            .addComponent(new Component(ComponentType.PLACA_DE_VIDEO, "Onboard", 0.00))
            .build();
    }

    public static Computer criarPCIntermediario() {
        return new CustomPCBuilder()
            .addComponent(new Component(ComponentType.PROCESSADOR, "Intel Core i3", 600.00))
            .addComponent(new Component(ComponentType.MEMORIA, "8GB DDR4", 250.00))
            .addComponent(new Component(ComponentType.ARMAZENAMENTO, "SSD 240GB", 300.00))
            .addComponent(new Component(ComponentType.FONTE, "Fonte 400W", 200.00))
            .addComponent(new Component(ComponentType.PLACA_MAE, "Placa-Mãe Intermediária", 400.00))
            .addComponent(new Component(ComponentType.GABINETE, "Gabinete Médio", 150.00))
            .addComponent(new Component(ComponentType.PLACA_DE_VIDEO, "GT 1030", 500.00))
            .build();
    }

    public static Computer criarPCAvancado() {
        return new CustomPCBuilder()
            .addComponent(new Component(ComponentType.PROCESSADOR, "Intel Core i5", 900.00))
            .addComponent(new Component(ComponentType.MEMORIA, "16GB DDR4", 450.00))
            .addComponent(new Component(ComponentType.ARMAZENAMENTO, "SSD 500GB", 450.00))
            .addComponent(new Component(ComponentType.FONTE, "Fonte 500W", 300.00))
            .addComponent(new Component(ComponentType.PLACA_MAE, "Placa-Mãe Avançada", 550.00))
            .addComponent(new Component(ComponentType.GABINETE, "Gabinete Gamer Médio", 250.00))
            .addComponent(new Component(ComponentType.PLACA_DE_VIDEO, "GTX 1660", 1200.00))
            .build();
    }

    public static Computer criarPCGamer() {
        return new CustomPCBuilder()
            .addComponent(new Component(ComponentType.PROCESSADOR, "Intel Core i7", 1300.00))
            .addComponent(new Component(ComponentType.MEMORIA, "32GB DDR4", 900.00))
            .addComponent(new Component(ComponentType.ARMAZENAMENTO, "SSD NVMe 1TB", 800.00))
            .addComponent(new Component(ComponentType.FONTE, "Fonte 650W", 500.00))
            .addComponent(new Component(ComponentType.PLACA_MAE, "Placa-Mãe Gamer", 800.00))
            .addComponent(new Component(ComponentType.GABINETE, "Gabinete RGB Full Tower", 400.00))
            .addComponent(new Component(ComponentType.PLACA_DE_VIDEO, "RTX 4070", 3000.00))
            .build();
    }
}
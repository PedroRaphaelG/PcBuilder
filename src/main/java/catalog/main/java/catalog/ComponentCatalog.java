package main.java.catalog;

import java.util.Arrays;
import java.util.List;

import main.java.model.Component;
import main.java.model.ComponentType;

public class ComponentCatalog {
    public static List<Component> getAllComponents() {
        return Arrays.asList(
            new Component(ComponentType.PROCESSADOR, "Intel Core i3 10100", 600),
            new Component(ComponentType.PROCESSADOR, "Intel Core i5 12400F", 1100),
            new Component(ComponentType.PROCESSADOR, "Intel Core i7 13700K", 2400),
            new Component(ComponentType.PROCESSADOR, "AMD Ryzen 3 3200G", 500),
            new Component(ComponentType.PROCESSADOR, "AMD Ryzen 5 5600X", 1000),
            new Component(ComponentType.PROCESSADOR, "AMD Ryzen 7 5800X", 1600),
            new Component(ComponentType.PROCESSADOR, "AMD Ryzen 9 7950X", 3100),

            new Component(ComponentType.MEMORIA, "8GB DDR4 2666MHz", 150),
            new Component(ComponentType.MEMORIA, "16GB DDR4 3200MHz", 300),
            new Component(ComponentType.MEMORIA, "32GB DDR5 5200MHz", 600),
            new Component(ComponentType.MEMORIA, "64GB DDR5 6000MHz", 1100),
            new Component(ComponentType.MEMORIA, "8GB DDR4 1600MHz", 100),
            new Component(ComponentType.MEMORIA, "16GB DDR5 5600MHz", 450),

            new Component(ComponentType.ARMAZENAMENTO, "HDD 500GB", 180),
            new Component(ComponentType.ARMAZENAMENTO, "HDD 1TB", 250),
            new Component(ComponentType.ARMAZENAMENTO, "SSD 240GB SATA", 120),
            new Component(ComponentType.ARMAZENAMENTO, "SSD 500GB NVMe", 300),
            new Component(ComponentType.ARMAZENAMENTO, "SSD 1TB NVMe Gen4", 700),
            new Component(ComponentType.ARMAZENAMENTO, "SSD 2TB NVMe Gen4", 1200),

            new Component(ComponentType.PLACA_DE_VIDEO, "GT 1030", 400),
            new Component(ComponentType.PLACA_DE_VIDEO, "GTX 1650", 900),
            new Component(ComponentType.PLACA_DE_VIDEO, "RTX 3060", 1800),
            new Component(ComponentType.PLACA_DE_VIDEO, "RTX 3070", 2500),
            new Component(ComponentType.PLACA_DE_VIDEO, "RTX 4070", 3200),
            new Component(ComponentType.PLACA_DE_VIDEO, "RX 6600", 1700),
            new Component(ComponentType.PLACA_DE_VIDEO, "RX 6700 XT", 1900),

            new Component(ComponentType.FONTE, "Fonte 400W Básica", 200),
            new Component(ComponentType.FONTE, "Fonte 450W 80 Plus", 250),
            new Component(ComponentType.FONTE, "Fonte 600W Bronze", 400),
            new Component(ComponentType.FONTE, "Fonte 650W Modular", 500),
            new Component(ComponentType.FONTE, "Fonte 750W Gold", 650),
            new Component(ComponentType.FONTE, "Fonte 850W Platinum", 850),

            new Component(ComponentType.PLACA_MAE, "ASRock A320M", 400),
            new Component(ComponentType.PLACA_MAE, "ASUS B450M", 550),
            new Component(ComponentType.PLACA_MAE, "MSI B550M", 750),
            new Component(ComponentType.PLACA_MAE, "MSI B660M", 800),
            new Component(ComponentType.PLACA_MAE, "Gigabyte X570", 1200),
            new Component(ComponentType.PLACA_MAE, "ASUS Z690", 1600),
            
            new Component(ComponentType.GABINETE, "Gabinete Cooler Master MasterBox Q300L", 300),
            new Component(ComponentType.GABINETE, "Gabinete NZXT H510", 450),
            new Component(ComponentType.GABINETE, "Gabinete Corsair 4000D", 350),
            new Component(ComponentType.GABINETE, "Gabinete Thermaltake Versa H21", 250),
            new Component(ComponentType.GABINETE, "Gabinete Redragon LEGION", 200)
        );
    }
}


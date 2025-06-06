package main.java.builder;

import main.java.model.Component;
import main.java.model.Computer;

public interface PCBuilder {
    PCBuilder addComponent(Component component);
    Computer build();
}
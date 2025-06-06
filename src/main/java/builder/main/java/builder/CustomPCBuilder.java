package main.java.builder;

import main.java.model.Component;
import main.java.model.Computer;

public class CustomPCBuilder implements PCBuilder {
    private Computer computer;

    public CustomPCBuilder() {
        this.computer = new Computer();
    }

    @Override
    public PCBuilder addComponent(Component component) {
        computer.addComponent(component);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer pc) {
        this.computer = pc;
    }
}

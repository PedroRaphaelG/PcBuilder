public interface PCBuilder {
    PCBuilder addComponent(Component component);
    Computer build();
}
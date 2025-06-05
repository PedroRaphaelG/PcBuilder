public class Component {
    private ComponentType type;
    private String name;
    private double price;

    public Component(ComponentType type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public ComponentType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (R$ " + price + ")";
    }
}
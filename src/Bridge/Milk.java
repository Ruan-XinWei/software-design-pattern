package Bridge;

public class Milk extends Food {

    public Milk() {
        super("Milk");
    }

    @Override
    public void show() {
        System.out.println("口味: " + getName());
    }
}

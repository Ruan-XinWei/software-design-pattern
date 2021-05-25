package Bridge;

public class Lemon extends Food {

    public Lemon() {
        super("Lemon");
    }

    @Override
    public void show() {
        System.out.println("口味: " + getName());
    }
}

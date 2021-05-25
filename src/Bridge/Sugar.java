package Bridge;

public class Sugar extends Food {

    public Sugar() {
        super("Sugar");
    }

    @Override
    public void show() {
        System.out.println("口味: " + getName());
    }
}

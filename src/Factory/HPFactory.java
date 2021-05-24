package Factory;

public class HPFactory implements IFactory {
    HP hp = new HP("HP Computer");

    @Override
    public String getName() {
        return hp.getName();
    }
}

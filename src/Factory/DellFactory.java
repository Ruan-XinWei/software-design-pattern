package Factory;

public class DellFactory implements IFactory {
    Dell dell = new Dell("Dell Computer");

    @Override
    public String getName() {
        return dell.getName();
    }
}

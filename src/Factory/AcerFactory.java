package Factory;

public class AcerFactory implements IFactory {
    Acer acer = new Acer("Acer Computer");

    @Override
    public String getName() {
        return acer.getName();
    }
}

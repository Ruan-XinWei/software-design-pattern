package Factory;

public class LenovoFactory implements IFactory {
    Lenovo lenovo = new Lenovo("Lenovo Computer");

    @Override
    public String getName() {
        return lenovo.getName();
    }
}

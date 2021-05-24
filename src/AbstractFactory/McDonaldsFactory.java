package AbstractFactory;

public class McDonaldsFactory implements IFactory {
    @Override
    public Cola getCola() {
        return new McDonaldsCola();
    }

    @Override
    public Hamburg getHamburg() {
        return new McDonaldsHamburg();
    }
}

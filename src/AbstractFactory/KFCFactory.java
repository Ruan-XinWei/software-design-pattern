package AbstractFactory;

public class KFCFactory implements IFactory {
    @Override
    public Cola getCola() {
        return new KFCCola();
    }

    @Override
    public Hamburg getHamburg() {
        return new KFCHamburg();
    }
}

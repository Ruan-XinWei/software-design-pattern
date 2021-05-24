package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        IFactory iFactory = new KFCFactory();
        System.out.println("Name: " + iFactory.getCola().getName());
        System.out.println("Name: " + iFactory.getHamburg().getName());
        iFactory = new McDonaldsFactory();
        System.out.println("Name: " + iFactory.getCola().getName());
        System.out.println("Name: " + iFactory.getHamburg().getName());
    }
}

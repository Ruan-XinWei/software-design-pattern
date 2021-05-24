package Factory;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new HPFactory();
        System.out.println("Name：" + factory.getName());
        factory = new AcerFactory();
        System.out.println("Name：" + factory.getName());
        factory = new LenovoFactory();
        System.out.println("Name：" + factory.getName());
        factory = new DellFactory();
        System.out.println("Name：" + factory.getName());
    }
}

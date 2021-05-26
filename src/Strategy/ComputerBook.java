package Strategy;

public class ComputerBook implements Book {
    @Override
    public void Cost() {
        System.out.println("计算机类图书7折");
    }
}

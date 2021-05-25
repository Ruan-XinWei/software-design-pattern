package Decorator;

public class Water extends Decorator{
    @Override
    public void show() {
        super.show();
        System.out.println("会趟水");
    }
}

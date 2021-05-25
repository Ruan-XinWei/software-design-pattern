package Decorator;

public class Speed extends Decorator{
    @Override
    public void show() {
        super.show();
        System.out.println("加快速度");
    }
}

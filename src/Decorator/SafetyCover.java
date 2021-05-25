package Decorator;

public class SafetyCover extends Decorator{
    @Override
    public void show() {
        super.show();
        System.out.println("保护罩");
    }
}

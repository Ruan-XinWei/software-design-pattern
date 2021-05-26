package Facade;

public class Alarm implements Device{
    @Override
    public void TurnOn() {
        System.out.println("开启警报器");
    }

    @Override
    public void TurnOff() {
        System.out.println("关闭警报器");
    }
}

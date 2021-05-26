package Facade;

public class Light implements Device{
    @Override
    public void TurnOn() {
        System.out.println("开启电灯");
    }

    @Override
    public void TurnOff() {
        System.out.println("关闭电灯");
    }
}

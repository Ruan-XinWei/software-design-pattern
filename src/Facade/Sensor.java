package Facade;

public class Sensor implements Device{
    @Override
    public void TurnOn() {
        System.out.println("开启感应器");
    }

    @Override
    public void TurnOff() {
        System.out.println("关闭感应器");
    }
}

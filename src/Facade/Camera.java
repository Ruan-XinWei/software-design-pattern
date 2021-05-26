package Facade;

public class Camera implements Device{

    @Override
    public void TurnOn() {
        System.out.println("开启录像机");
    }

    @Override
    public void TurnOff() {
        System.out.println("关闭录像机");
    }
}

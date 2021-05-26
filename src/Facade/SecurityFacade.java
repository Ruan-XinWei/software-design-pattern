package Facade;

public class SecurityFacade {
    private Camera camera;
    private Light light;
    private Sensor sensor;
    private Alarm alarm;

    public SecurityFacade(){
        this.camera = new Camera();
        this.light = new Light();
        this.sensor = new Sensor();
        this.alarm = new Alarm();
    }

    public void TurnOn() {
        camera.TurnOn();
        light.TurnOn();
        sensor.TurnOn();
        alarm.TurnOn();
    }

    public void TurnOff() {
        camera.TurnOff();
        light.TurnOff();
        sensor.TurnOff();
        alarm.TurnOff();
    }
}

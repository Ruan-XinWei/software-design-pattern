package Decorator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("喜羊羊");

        SafetyCover safetyCover = new SafetyCover();
        Speed speed = new Speed();
        Water water = new Water();

        safetyCover.Decorate(person);
        speed.Decorate(safetyCover);
        water.Decorate(speed);

        water.show();
    }
}

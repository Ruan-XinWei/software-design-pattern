package Builder;

public class Main {
    public static void main(String[] args) {
        Car car;
        CarBuilder carBuilder = new BMWBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        carDirector.Constrcut();
        car = carBuilder.getCar();
        car.Introduce();

        carBuilder = new BenzBuilder();
        carDirector = new CarDirector(carBuilder);
        carDirector.Constrcut();
        car = carBuilder.getCar();
        car.Introduce();

    }
}

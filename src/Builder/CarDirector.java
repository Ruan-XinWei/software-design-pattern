package Builder;

public class CarDirector {
    CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarBuilder getCarBuilder() {
        return carBuilder;
    }

    public void Constrcut() {
        carBuilder.BuildBoby();
        carBuilder.BuildOilBox();
        carBuilder.BuildWheel();
    }
}

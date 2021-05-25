package Builder;

public abstract class CarBuilder {
    protected Car car = new Car();

    public abstract void BuildWheel();

    public abstract void BuildOilBox();

    public abstract void BuildBoby();

    public Car getCar() {
        return car;
    }
}

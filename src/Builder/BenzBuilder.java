package Builder;

public class BenzBuilder extends CarBuilder {
    @Override
    public void BuildWheel() {
        car.setWheel("Benz Wheel");
    }

    @Override
    public void BuildOilBox() {
        car.setOilbox("Benz OilBox");
    }

    @Override
    public void BuildBoby() {
        car.setBody("Benz Body");
    }
}

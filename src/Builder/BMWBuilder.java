package Builder;

public class BMWBuilder extends CarBuilder {
    @Override
    public void BuildWheel() {
        car.setWheel("BMW Wheel");
    }

    @Override
    public void BuildOilBox() {
        car.setOilbox("BMW OilBox");
    }

    @Override
    public void BuildBoby() {
        car.setBody("BMW Body");
    }
}

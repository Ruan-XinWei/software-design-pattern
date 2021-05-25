package Bridge;

public class MediumCoffee extends Cup {

    @Override
    public void Show() {
        System.out.print("杯型：中杯咖啡\t");
        getFood().show();
    }
}

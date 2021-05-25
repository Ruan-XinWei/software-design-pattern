package Bridge;

public class SmallCoffee extends Cup {

    @Override
    public void Show() {
        System.out.print("杯型：小杯咖啡\t");
        getFood().show();
    }
}

package Bridge;

public class JorumCoffee extends Cup {

    @Override
    public void Show() {
        System.out.print("杯型：大杯咖啡\t");
        getFood().show();
    }
}

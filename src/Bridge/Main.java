package Bridge;

public class Main {
    public static void main(String[] args) {
        Cup cup = new JorumCoffee();
        cup.setFood(new Milk());
        cup.Show();

        cup = new MediumCoffee();
        cup.setFood(new Sugar());
        cup.Show();

        cup = new SmallCoffee();
        cup.setFood(new Lemon());
        cup.Show();
    }
}

package Strategy;

public class Main {
    public static void main(String[] args) {
        Pay pay = new Pay(new EnglishBook());
        pay.Cost();
        pay = new Pay(new ComputerBook());
        pay.Cost();
    }
}

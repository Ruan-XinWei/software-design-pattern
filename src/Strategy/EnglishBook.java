package Strategy;

public class EnglishBook implements Book {
    @Override
    public void Cost() {
        System.out.println("英语类图书6折");
    }
}

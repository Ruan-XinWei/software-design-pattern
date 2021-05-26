package Strategy;

public class Pay {
    private Book book;

    public Pay(Book book) {
        this.book = book;
    }

    public void Cost() {
        book.Cost();
    }
}

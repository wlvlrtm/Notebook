public class Book {
    int price;

    public Book(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("Book [price = " + this.price + "]");
    }
}

public class Book {
    private String name;        // 책 서명
    private int publishYear;    // 출판년도
    private int price;          // 가격


    public Book(String name, int publishYear, int price) {
        this.name = name;
        this.publishYear = publishYear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPublishYear() {
        return publishYear;
    }

}

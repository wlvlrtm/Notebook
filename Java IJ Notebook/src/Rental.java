public class Rental {
    private Member member;
    private Book book;
    private PricePolicy pricePolicy;
    private int n;  // 책 수


    public Rental(Member member, Book book, PricePolicy pricePolicy, int n) {
        this.member = member;
        this.book = book;
        this.pricePolicy = pricePolicy;
        this.n = n;
        
        this.member.setAccPrice(pricePolicy.calcPrice(book.getPrice(), n));
    }

    public int getPrice() {
        return this.pricePolicy.calcPrice(book.getPrice(), n);
    }

}

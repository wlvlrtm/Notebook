public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Kim");
        Member member2 = new Member("Ken");        

        Book book1 = new Book("TestBook1", 1900, 100);
        Book book2 = new Book("TestBook2", 2000, 1000);

        Rental rental1 = new Rental(member1, book1, new OrdinaryPricePolicy(), 2);
        Rental rental2 = new Rental(member2, book2, new BookDiscountPricePolicy(), 3);

        System.out.println(member1.getName());
        System.out.println(member2.getName());
        System.out.println(rental1.getPrice());
        System.out.println(rental2.getPrice());        
    }

}

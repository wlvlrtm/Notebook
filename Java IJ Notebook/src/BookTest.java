public class BookTest {
    public static void main(String[] args) {
        Book[] arr = {new Book(15000), new Book(50000), new Book(20000)};

        System.out.println("정렬 전");

        for (Book book : arr) {
            System.out.println(book);
        }

        System.out.println("정렬 후");
        
        for (Book book : arr) {
            System.out.println(book);
        }
    }
}

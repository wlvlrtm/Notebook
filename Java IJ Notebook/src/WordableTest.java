public class WordableTest {
    public static void main(String[] args) {
        Wordable[] m = {
            () -> {
                System.out.println("가위");
            },
            () -> {
                System.out.println("나비");
            },
            () -> {
                System.out.println("다리");
            },
            () -> {
                System.out.println("마차");
            }
        }; 

        // 반복문
        for (Wordable wordable : m) {
            wordable.word();
        }
    }
}

public class FlyableTest {
    public static void main(String[] args) {
        Flyabe f = new Flyabe() {
            @Override
            public void speed() {
                System.out.println("속도");
            }
            @Override
            public void height() {
                System.out.println("높이");
            }
        };
        f.speed();
        f.height();
    }
}

public class TalkableTest {
    static void speak(Talkable talkable) {
        System.out.println(talkable.talk());
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}
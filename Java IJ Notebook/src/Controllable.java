public interface Controllable {
    void TurnOff();
    void TurnOn();

    int pay = 10;

    default void Repair() {
        Show("Repair");
    }

    static void Reset() {
        System.out.println("RESET!");
    }

    private void Show(String str) {
        System.out.println(str);
    }


}

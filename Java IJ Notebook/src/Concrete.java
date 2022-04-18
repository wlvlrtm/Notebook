public class Concrete extends Abstract {
    int j;

    public Concrete(int x, int y) {
        this.i = x;
        this.j = y;
    }

    @Override
    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

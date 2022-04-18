public interface Shape {
    float PI = 3.14f;

    public void draw();
    public float getArea();

    public default void reDraw() {
        System.out.println("-- 다시 그립니다.");
        draw();
    }
}

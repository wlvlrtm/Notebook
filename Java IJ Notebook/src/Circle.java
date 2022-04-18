public class Circle implements Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("면적은 " + getArea());
    }

    @Override
    public float getArea() {
        return (this.r * this.r * PI);
    }
}

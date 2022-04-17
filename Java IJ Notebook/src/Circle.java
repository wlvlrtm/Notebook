public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing Circle.");
    }

    public double findArea() {
        return PI * radius * radius;
    }

    
}

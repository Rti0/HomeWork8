public class Circle extends Shape {
    public String getArea;
    private double radius =1.0;

    public Circle(double radius) {
        super("Green", true);
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super("Green", true);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea(){

        return radius*3.14;
    }

    public double getPerimeter(){

        return 2*radius*3.14;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


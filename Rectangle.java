public class Rectangle extends Shape {
    private  double side = 1.2;
    private double width=1.0;
    private double length=1.0;


    public Rectangle(double width, double length, String blue, boolean b) {
        super( "Green", true);
        this.width = this.width;
        this.length = this.length;
    }

    public Rectangle(String green, boolean b, double width, double length) {
        super(green, b);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double side, String color, boolean filled) {
        super(color,filled);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    double getArea(){

        return length*width;
    }
    public double getPerimeter(){

        return (length+width)*2;
    }
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
}

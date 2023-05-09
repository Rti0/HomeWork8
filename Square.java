public class Square extends Rectangle{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side,String color,boolean filled) {
        super(side,color,filled);
        this.side = side;
    }

    double getArea(){

        return side*4;
    }

    public double getPerimeter(){

        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

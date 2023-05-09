public class Main {
    public static void main(String[] args) {
        //الشكل
        boolean b = true;
        Shape sh1=new Shape("green",b);
        System.out.println(sh1);
        //محيط ومساحة الدائره
        Circle c1=new Circle(3.0);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        //محيط ومساحة المستطيل
        Rectangle r1 = new Rectangle(2.0, 8.0, "green", true) ;
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        //محيط ومساحة المربع
        Square sq1 = new Square(9.0, "black", false);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
    }
}
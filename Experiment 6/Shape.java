abstract class Shapee {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}
class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class Shape {
    public static void main(String[] args) {
        System.out.println("Sitanshu,24csu323");
        Area a = new Area();

        a.RectangleArea(10, 5);
        a.SquareArea(4);         
        a.CircleArea(3);         
    }
}

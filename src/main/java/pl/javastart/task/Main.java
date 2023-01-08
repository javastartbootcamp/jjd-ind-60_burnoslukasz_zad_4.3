package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(2);
        double sqArea = square1.calculateSquareArea();
        System.out.println("Square area : " + sqArea + "m2.");

        Triangle triangle1 = new Triangle(2, 3, 4);
        double triaPermiter = triangle1.calculateTrianglePerimeter();
        System.out.println("Triangle permiter " + triaPermiter + "m.");

        Circle circle1 = new Circle(2, 3.14);
        double cirArea = circle1.calculateCircleArea();
        System.out.println("Circle area: " + cirArea + "m2.");

        Rectangle rectangle1 = new Rectangle(2, 3);
        double rectPremiter = rectangle1.calculateRectPerimeter();
        System.out.println("Rectangle permiter: " + rectPremiter + "m.");
    }
}







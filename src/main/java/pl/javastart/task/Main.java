package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square();
        square1.a = 2;
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double v = shapeCalculator.calculateSquareArea(square1);
        System.out.println("Square area : " + v + "m2");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.a = 2;
        rectangle1.b = 3;
        double v1 = shapeCalculator.calculateRectPerimeter(rectangle1);
        System.out.println("Rectangle premiter : " + v1 + "m");

        Circle circle1 = new Circle();
        circle1.pi = 3.14;
        circle1.r = 1;
        double v2 = shapeCalculator.calculateCircleArea(circle1);
        System.out.println("Circle area : " + v2 + "m2");

        Triangle triangle1 = new Triangle();
        triangle1.a = 2;
        triangle1.b = 3;
        triangle1.c = 4;
        double v3 = shapeCalculator.calculateTrianglePerimeter(triangle1);
        System.out.println("Triangle premiter : " + v3 + "m");
    }
}

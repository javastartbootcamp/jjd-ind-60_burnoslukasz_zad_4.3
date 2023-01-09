package pl.javastart.task;

public class ShapeCalculator {
    public double calculateSquareArea(Square square) {
        return Math.pow(square.a, 2);
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.r, 2);
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return rectangle.a * 2 + rectangle.b * 2;
    }
}

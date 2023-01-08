package pl.javastart.task;

public class ShapeCalculator {
    double calculateSquareArea(Square square) {
        return Math.pow(square.a, 2);
    }

    double calculateCircleArea(Circle circle) {
        return circle.pi * Math.pow(circle.r, 2);
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return rectangle.a * 2 + rectangle.b * 2;
    }
}

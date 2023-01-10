package pl.javastart.task;

public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculateRectPerimeter() {
        return a * 2 + b * 2;
    }
}

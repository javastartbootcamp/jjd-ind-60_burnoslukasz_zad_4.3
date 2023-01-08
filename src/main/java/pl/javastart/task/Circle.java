package pl.javastart.task;

public class Circle {
    double r;
    double pi;

    public Circle(double r, double pi) {
        this.r = r;
        this.pi = pi;
    }

    double calculateCircleArea() {
        return pi * Math.pow(r, 2);
    }
}

package pl.javastart.task;

public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    double calculateCircleArea() {
        return Math.PI * Math.pow(r, 2);
    }
}

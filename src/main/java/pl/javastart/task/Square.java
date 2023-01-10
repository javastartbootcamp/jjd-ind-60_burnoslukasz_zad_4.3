package pl.javastart.task;

public class Square {
    double a;

    public Square(double a) {
        this.a = a;
    }

    double calculateSquareArea() {
        return Math.pow(a, 2);
    }
}

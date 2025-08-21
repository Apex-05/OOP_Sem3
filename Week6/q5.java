import java.io.*;

abstract class Figure {
    double x, y;
    Figure(double x, double y) {
        this.x = x; this.y = y;
    }
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double x, double y) { super(x, y); }
    double area() { return x * y; }
}

class Triangle extends Figure {
    Triangle(double x, double y) { super(x, y); }
    double area() { return 0.5 * x * y; }
}

class Square extends Figure {
    Square(int side) { super(side, side); }
    double area() { return x * y; }
}

class q5 {
    public static void main(String args[]) {
        Figure fig;
        fig = new Rectangle(2, 3);
        System.out.println("Rectangle: " + fig.area());
        fig = new Triangle(5, 2);
        System.out.println("Triangle: " + fig.area());
        fig = new Square(2);
        System.out.println("Square: " + fig.area());
    }
}

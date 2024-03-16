package lr2;

import static java.lang.Math.PI;

public class Task6 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.5, 5.5);
        Circle circle = new Circle(5.7);
        Square square = new Square(7.1);

        System.out.println("Площадь прямоугольника со сторонами a = %s, b = %s равна %s".formatted(rectangle.getLength(), rectangle.getWidth(), rectangle.calculateArea()));
        System.out.println("Периметр прямоугольника со сторонами a = %s, b = %s равен %s".formatted(rectangle.getLength(), rectangle.getWidth(), rectangle.calculatePerimeter()));

        System.out.println("Площадь круга с радиусом r = %s равна %s".formatted(circle.getRadius(), circle.calculateArea()));
        System.out.println("Периметр круга с радиусом r = %s равен %s".formatted(circle.getRadius(), circle.calculatePerimeter()));

        System.out.println("Площадь квадрата со стороной a = %s равна %s".formatted(square.getLength(), square.calculateArea()));
        System.out.println("Периметр квадрата со стороной a = %s равен %s".formatted(square.getLength(), square.calculatePerimeter()));
    }
}

class Circle implements Area, Perimeter {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

class Square implements Area, Perimeter {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double calculatePerimeter() {
        return length * 4;
    }
}

interface Area {
    double calculateArea();
}

interface Perimeter {
    double calculatePerimeter();
}
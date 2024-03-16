package lr2;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Task9 {

    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(10);
        Square2 square2 = new Square2(4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Периметр круга с r = %s равен %s".formatted(circle2.getRadius(), circle2.calculatePerimeter()));
        System.out.println("Площадь круга с r = %s равна %s".formatted(circle2.getRadius(), circle2.calculateArea()));

        System.out.println("Периметр квадрата с a = %s равен %s".formatted(square2.getSide(), square2.calculatePerimeter()));
        System.out.println("Площадь квадрата с a = %s равна %s".formatted(square2.getSide(), square2.calculateArea()));

        System.out.println("Периметр треугольника с a = %s, b = %s, c = %s равен %s".formatted(triangle.getSide1(), triangle.getSide2(), triangle.getSide3(), triangle.calculatePerimeter()));
        System.out.println("Площадь треугольника с a = %s, b = %s, c = %s равна %s".formatted(triangle.getSide1(), triangle.getSide2(), triangle.getSide3(), triangle.calculateArea()));
    }
}

abstract class Shape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class Circle2 extends Shape {
    private double radius;

    public Circle2(double radius) {
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

class Square2 extends Shape {
    private double side;

    public Square2(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double calculateArea() {
        double perimeter = calculatePerimeter();

        return sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
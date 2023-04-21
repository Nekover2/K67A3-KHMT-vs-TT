package neko.oop.week6.shape;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle( ) { }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.1416;
    }
    public double getPerimeter() {
        return 2 * 3.1416 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                "radius=" + radius +
                ']';
    }
}
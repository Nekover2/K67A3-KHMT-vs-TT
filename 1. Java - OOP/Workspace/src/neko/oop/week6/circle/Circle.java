package neko.oop.week6.circle;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle() {}
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return {double} the circumstance of Circle
     */

    public double getCircumstance() {
        return radius * 2 * 3.1416;
    }

    /**
     * @return (double) Area of Circle
     */
    public double getArea() {
        return radius * radius * 3.1416;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Circumstance=" + getCircumstance() +
                ", Area=" + getArea() +
                '}';
    }
}

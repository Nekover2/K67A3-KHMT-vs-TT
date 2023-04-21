package neko.oop.week5;

public class Circle {
    private double radius;
    private String color;

    //Constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    // Set/get methods
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //

    /**
     * @return (double) Circumstance of Circle
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

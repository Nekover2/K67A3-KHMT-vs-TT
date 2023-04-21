package neko.oop.week6.circle;

public class Cylinder_Composition {
    private Circle base;
    private double height;

    public Cylinder_Composition() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder_Composition(double height) {
        this.height = height;
    }

    public Cylinder_Composition(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder_Composition(double height, String color, double radius) {
        this.base = new Circle(radius,color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder_Composition{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}

package neko.oop.week7.ResizableGeometricObject;

import neko.oop.week7.GeometricObject.GeometricObject;

public class Circle implements GeometricObject {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

}
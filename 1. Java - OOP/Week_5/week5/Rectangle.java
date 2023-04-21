package neko.oop.week5;


public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea() {
        return width * length;
    }

    public float getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}

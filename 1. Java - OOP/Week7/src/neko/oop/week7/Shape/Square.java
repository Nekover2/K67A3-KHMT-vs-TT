package neko.oop.week7.Shape;

public class Square extends Rectangle{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return this.width;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

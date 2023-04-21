package neko.oop.week6.shape;

public class Square extends Rectangle{
    public Square() {}
    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled,side,side);
    }

    public double getSide() {
        return super.getWidth();
    }
    public void setSide(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

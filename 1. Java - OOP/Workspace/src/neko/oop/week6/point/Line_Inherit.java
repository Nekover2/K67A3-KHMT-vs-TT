package neko.oop.week6.point;

public class Line_Inherit extends Point{
    private Point end;

    public Line_Inherit(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Line_Inherit(int beginX, int beginY, int endX, int endY) {
        super(beginX,beginY);
        this.end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line_Inherit[" + super.toString() +
                "end=" + end +
                ']';
    }

    public Point getBegin() {
        return this;
    }

    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int value) {
        super.setX(value);
    }

    public void setBeginY(int value) {
        super.setY(value);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x,y);
    }
    public void setEndX(int value) {
        end.setX(value);
    }

    public void setEndY(int value) {
        end.setY(value);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x,y);
    }

    public int getLength() {
        int xDiff = getBeginX()- getEndX();
        int yDiff = getBeginY() - getEndY();
        return (int)Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient() {
        int xDiff = getBeginX()- getEndX();
        int yDiff = getBeginY() - getEndY();
        return (double) Math.atan2(yDiff, xDiff);
    }
}

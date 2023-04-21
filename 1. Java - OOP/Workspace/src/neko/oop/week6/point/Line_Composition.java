package neko.oop.week6.point;

public class Line_Composition {
    private Point begin;
    private Point end;
    public Line_Composition(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line_Composition(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX,beginY);
        this.end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line_Composition{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int value) {
        begin.setX(value);
    }

    public void setBeginY(int value) {
        begin.setY(value);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x,y);
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

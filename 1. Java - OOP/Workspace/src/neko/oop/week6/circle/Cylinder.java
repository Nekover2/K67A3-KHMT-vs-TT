package neko.oop.week6.circle;


public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

//    public double getAroundArea() {
//        return 2 * 3.1415
//    }

    /**
     * @return {double} Volume of the Cylinder
     */
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder - subclass of " + super.toString() + "{" +
                "height=" + height +
                '}';
    }
}

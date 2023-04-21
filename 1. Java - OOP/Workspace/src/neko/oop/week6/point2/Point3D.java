package neko.oop.week6.point2;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {}

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] res = new float[3];
        res[0] = super.getX();
        res[1] = super.getY();
        res[2] = this.z;
        return res;
    }
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}

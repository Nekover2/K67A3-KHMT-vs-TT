public class Student
{
    private String hovaten;
    private double diem;
    public Student (String hoten, double diemthi)
    {
        hovaten = hoten;
        diem = diemthi;
    }
    public double getDiem()
    {
        return diem;
    }
    public void printStudent()
    {
        System.out.println(hovaten + " " + diem+"\n");
        
    }
}
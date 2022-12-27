import java.util.*;
public class StudentTest
{
    public static void inputStudents (Student[] studentArray, Scanner reader)
    {
        for(int i=0; i<studentArray.length ; i++)
        {
            String tmpName = reader.nextLine();
            double tmpDiem = reader.nextDouble();
            reader.nextLine();
            studentArray[i] = new Student(tmpName, tmpDiem);
        }
    }
    public static void printStudents (Student[] studentArray)
    {
        for(Student val: studentArray)
            val.printStudent();
    }
    public static void sortScores (Student[] studentArray)
    {
        //Anonymous comparator :v
        Arrays.sort(studentArray, new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                if(s1.getDiem() > s2.getDiem()) return 1;
                else return -1;
            }
        });
    }
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student[] arr = new Student[n];
        inputStudents(arr, sc);
        sc.close();
        sortScores(arr);
        printStudents(arr);
    }
}
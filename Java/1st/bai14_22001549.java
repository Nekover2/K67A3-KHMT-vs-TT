import java.lang.Math;
import java.util.Scanner;
public class bai14_22001549 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Double x1 = sc.nextDouble();
        Double y1 = sc.nextDouble();
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();
	    System.out.println(Math.round(Math.sqrt( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) )*100.00)/100.00);
        sc.close();
    }
}

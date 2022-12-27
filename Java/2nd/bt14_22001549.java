/**
* Just an exercise
*
* @author Nekov5
* @version 0.0.1 beta1 (pre-release)
* @since 2022-11-18
*/
import java.util.Scanner;
import java.lang.Math;
public class bt14_22001549 {
    static boolean IsSides(double a, double b, double c)
    {
        Double _Min = Math.min(Math.min(a,b), c);
		Double _Max = Math.max(Math.max(a, b), c);
		Double _Mid = a + b + c - _Min - _Max;
		return (_Min+_Mid)>_Max;
    }

    static double Area(double a, double b, double c)
    {
		Double _P = (a + b + c)/2;
        return  Math.sqrt(_P*(_P-a)*(_P-b)*(_P-c));    
    }
    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        System.out.print("a, b, c: "); double a = cIn.nextDouble(); double b = cIn.nextDouble(); double c = cIn.nextDouble();
        if(IsSides(a, b, c)) System.out.printf("Area: %.3f\n", Area(a, b, c));
        else System.out.print("Huh? What did you type? Not a triangle then...");
        cIn.close();
    }
}

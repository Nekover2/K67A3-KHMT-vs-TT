/**
* Just an exercise
*
* @author Nekov5
* @version 0.0.1 beta1 (pre-release)
* @since 2022-11-18
*/
import java.util.Scanner;
public class bt15_22001549 {
    static boolean IsSides(double a, double b, double c)
    {
        Double _Min = Math.min(Math.min(a,b), c);
		Double _Max = Math.max(Math.max(a, b), c);
		Double _Mid = a + b + c - _Min - _Max;
		return (_Min+_Mid)>_Max;
    }
    static boolean isRightTriangle (double a, double b, double c) 
    {
        Double _Min = Math.min(Math.min(a,b), c);
        Double _Max = Math.max(Math.max(a, b), c);
		Double _Mid = a + b + c - _Min - _Max;
		return (_Min * _Min + _Mid * _Mid) == _Max * _Max;
    }    
    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        System.out.print("a, b, c: "); double a = cIn.nextDouble(); double b = cIn.nextDouble(); double c = cIn.nextDouble();
        if(! IsSides(a, b, c)) System.out.print("Huh? What did you type? Not a triangle then...");
        else if(isRightTriangle(a, b, c)) System.out.print("Yeah, this is a right (love) triangle...");
        else System.out.print("Nope, it's a triangle, but not a right triangle...");
        cIn.close();
    }
}

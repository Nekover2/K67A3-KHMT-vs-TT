/**
* Just an exercise
*
* @author Nekov5
* @version 0.0.1 (pre-release)
* @since 2022-11-18
*/


import java.util.Scanner;
import java.lang.Math;
public class bt10_22001549 {
    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        System.out.print("m1: "); double m1 = cIn.nextDouble();
        System.out.print("m2: "); double m2 = cIn.nextDouble();
        System.out.print("r: "); double r = cIn.nextDouble();
        double Force = (6.67408 * Math.pow(10, -11) * m1 * m2)/(r*r);
        System.out.printf("Result: %.4f", Force);
        cIn.close();
    }
}

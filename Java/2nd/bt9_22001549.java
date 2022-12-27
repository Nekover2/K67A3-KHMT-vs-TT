/**
* Just an exercise
*
* @author Nekov5
* @version 0.0.1 (pre-release)
* @since 2022-11-18
*/


///***********************

import java.util.Scanner;
public class bt9_22001549 {
    public static void main(String[] args) {
        Scanner cInput = new Scanner(System.in);
        System.out.print("Please provide your point: ");
        double testGrade = cInput.nextDouble();
        boolean isA = (80 <= testGrade) && (testGrade <= 100);
        if (isA) System.out.println("Yeah, you got A grade!");
        else System.out.println("OOPS, better luck next time :v");
        cInput.close();
    }
}

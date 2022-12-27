/**
* Just an exercise
*
* @author Nekov5
* @version 0.0.1 beta1 (pre-release)
* @since 2022-11-18
*/
import java.util.Scanner;
import java.lang.Math;
public class bt11_22001549 {
    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        System.out.print("x: "); int x = cIn.nextInt();
        System.out.print("y: "); int y = cIn.nextInt();
        System.out.printf("Distance from this point to O(0,0): %.4f", Math.sqrt(x*x + y*y));
        cIn.close();
    }
}

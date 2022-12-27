/**
* Just an exercise
*
* @author Nekov5
* @version 0.0.1 beta1 (pre-release)
* @since 2022-11-18
*/
import java.util.Scanner;
import java.lang.Math;
public class bt13_22001549 {
    
    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        System.out.print("Please provide wind speed: "); double spd = cIn.nextDouble();
        System.out.print("Please provide the temprature: "); double tmp = cIn.nextDouble();
        if(tmp>=50) 
        {
            System.out.print("This program will work properly only if the temperature is below 50*C, please make sure that you've type the right num");
            cIn.close();
            return;
        }
        double _Result = 35.74 + 0.6125*tmp +   (0.4275*tmp - 35.75) * Math.pow(spd, 0.16);
        System.out.printf("Result: %.8f", _Result);
        cIn.close();
    }
}

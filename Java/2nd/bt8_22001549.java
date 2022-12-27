/**
* Just an exercise
*
* @author Nekov5
* @version 0.0.1 (pre-release)
* @since 2022-11-18
*/
public class bt8_22001549 {
    public static void main(String args[]){
        int x = 5;//spoce of x: whole function main
        int y = 72;
        {
        x = 6; // Error: variable x is already defined
        System.out.println("x = "+x + "y="+y);
        }
        System.out.println("x = "+x + "y="+y);
        // Error: cannot find symbol (symbol: variable y)
    }
}

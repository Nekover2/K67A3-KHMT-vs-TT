/**
* Just an exercise
*
* @author Nekov5
* @version 0.0.1 beta1 (pre-release)
* @since 2022-11-18
*/
import java.util.Scanner;
public class bt12_22001549 {
    public static int ConvertTime2Sec(int h, int m, int s)
    {
        return h*3600+m*60+s;
    }
    public static void PrintTime(int s)
    {
        int h = (int)(s/3600);
        s -= h*3600;
        int m = (int)(s/60);
        s-=m*60;
        System.out.printf("%d giờ - %d phút - %d giây\n", h, m, s);
    }
    public static void main(String[] args) {
        Scanner cIn = new Scanner(System.in);
        System.out.print("Nhập số giây: "); int sec = cIn.nextInt();
        PrintTime(sec);
        System.out.print("Nhập lần lượt giờ, phút, giây: "); int hrs = cIn.nextInt(); int min = cIn.nextInt(); sec = cIn.nextInt();
        int TotalSec = ConvertTime2Sec(hrs, min, sec);
        System.out.printf("Tổng số giây: %d", TotalSec);
        cIn.close();
    }
}

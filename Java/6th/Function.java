/** Function.java
 * Nhập vào số thực x và số nguyên dương n từ bàn phím (x nhập trước, n nhập sau).
 * Tính và in ra giá trị biểu thức  f(x) = x^4 *cosh(5x) + 11x  - 9
 * */
import java.util.*;

public class Function{

    public static double f(double x, int n){ // tính và trả về f(x)
        // bổ sung mã lệnh
        return x*x*x* sinh5x(x,n) - 9*x + 5;
         // sửa giá trị trả về - nhưng cần đúng kiểu
    }
    
    public static double sinh5x(double x, int n){ // tính và trả về cosh(5x)
        // bổ sung mã lệnh
        double tmp = 5*x , sum = 5*x;
        for(int i=1 ; i<=n ; i++)
        {
            tmp *=  25*x*x / (i*2) / (i*2 + 1);
            sum += tmp;
        }
        return sum;
    }
    
    // in ra số thực t với phần thập phân lấy đến 4 chữ số, sau khi in có xuống dòng.
    public static void printRound4digs(double  t) {
        System.out.printf("%.4f\n", t );
    }
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        double x = sc.nextDouble();
        int n = sc.nextInt();
        sc.close();
        printRound4digs( f(x , n) );
    }
    // phương thức main để thực hiện.
}
/**
 * Hoàn thiện chương trình Collinear cho phép nhập 2 số nguyên m, n và mảng A
 * m x n phần tử nguyên. Kiểm tra và liệt kê các cột cộng tuyến theo yêu cầu
 * Giữ cấu trúc hàm kiểm tra isCollinear(int V[], int U[]), bổ sung các hàm/
 * phương thức khác để hoàn thành chương trình.
 * */
import java.util.*;
class Collinear{
    
    //Hoàn thiện định nghĩa hàm/phương thức kiểm tra 2 mảng cộng tuyến dưới đây
    static boolean isCollinear(int V[], int U[]){
        double ct = 0;
        for(int i = 1 ; i<V.length; i++)
            if(U[i] != 0 && V[i] !=0)
            {
                ct = (double) U[i] / V[i];
            }
        for(int i = 1 ; i<V.length; i++)
            if(V[i] * ct != U[i]) return false;
        return true;
        // bổ sung mã của hàm/phương thức kiểm tra U, V có cộng tuyến hay không
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner( System.in );
        int m =sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0 ; i<m; i++)
            for(int j=0; j<n; j++)
                arr[i][j] = sc.nextInt();
        sc.close();
        int[][] rotateArr = new int[n][m];
        for(int i=0 ; i<m; i++)
            for(int j=0; j<n; j++)
            rotateArr[j][i] = arr[i][j];
        System.out.print(0+" ");
            
        for(int i=1; i< n; i++)
        {
            int _res = i;
            for(int j=0; j < i; j++)
                if( isCollinear(rotateArr[i], rotateArr[j]) )
                {
                    _res = j;
                    break;
                }
            System.out.print(_res + " ");
        }
            
    }
}
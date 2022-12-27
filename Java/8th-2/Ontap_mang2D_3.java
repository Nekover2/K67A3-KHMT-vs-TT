import java.util.*;

public class Ontap_mang2D_3{

    /* thực hiện nhập số nguyên m, n và trả lại mảng hai chiều m x n số nguyên nhập từ bàn phím */
    public static int[][] readMatrix(Scanner reader) {
        int m = reader.nextInt(), n = reader.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = reader.nextInt();
        return arr;
    }
    
    /* thực hiện việc in mảng hai chiều Mtr ra màn hình dạng ma trận */
    public static void printMatrix(int[][] Mtr) {
        for(int[] arr : Mtr)
        {
            for(int val: arr)
                System.out.print(val + " ");
            System.out.println("");
        }
    }
    
    static boolean isPerfect(int n)
    {
        //begin edit
        if( n <=1 ) return false;
        int sum =1;  
        for(int i = 2; i< Math.sqrt(n) ; i++)
            if(n%i==0) sum += i + n/i;
        if(n%Math.sqrt(n)==0) sum+= Math.sqrt(n);
        if(sum==n) return true;
        else return false;
        //end edit
        
    }

    /* liệt kê chỉ số dòng của các phần tử là số hoàn thiện trong cột thứ k ma trận Mtr */
    public static void listPerfectNum(int[][] Mtr, int k) {
        for(int i=0; i< Mtr.length; i++)
            if( isPerfect(Mtr[i][k]) ) System.out.printf("%d ", i);
        System.out.println("");
    }
    
    /*  thực hiện tính và chuẩn 2 của dòng thứ k của Mtr */
    public static double normRows(int[][] Mtr, int k) {
         // bổ sung mã lệnh - có thể thay đổi giá trị trả về nhưng cần đúng kiểu 
         double sum = 0;
         for(int val : Mtr[k-1])
            sum+= val*val;
         return Math.sqrt(sum);
    }

    /* thực hiện việc tính và in chuẩn 2 của các dòng trong Mtr ra màn hình */
    public static void printRowsNorm(int[][] Mtr)  {
        for(int i = 1 ;i<=Mtr.length;i++)
            System.out.print(Math.round(normRows(Mtr, i) *10000.0)/10000.0 + " ");
        System.out.println("");
    }
    
}
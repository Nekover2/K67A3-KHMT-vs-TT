/**
 * Hoàn thiện các phương thức trong lớp Ontap_mang2D_1 theo các yêu cầu 
 * như trong phần mô tả và đề bài. Các phương thức cần được giữ nguyên dạng
 * tên / danh sách tham đối/ kiểu trả về/ mẫu khai báo ....
 * Có thể bổ sung các phương thức khác nếu cần.
 * */
import java.util.Scanner;

public class Ontap_mang2D_1{

    /* thực hiện nhập số nguyên m, n và trả lại mảng hai chiều m x n số nguyên nhập từ bàn phím */
    public static int[][] readMatrix(Scanner reader) {
        // bổ sung mã lệnh - có thể thay đổi giá trị trả về nhưng cần đúng kiểu 
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
    
    static boolean isPerfect( int n )
    {
        if( n <=1 ) return false;
        int sum =1;  
        for(int i = 2; i< Math.sqrt(n) ; i++)
            if(n%i==0) sum += i + n/i;
        if(n%Math.sqrt(n)==0) sum+= Math.sqrt(n);
        return n==sum;
    }
    /* liệt kê chỉ số cột của các phần tử là số hoàn thiện trong dòng thứ k ma trận Mtr */
    public static void listPerfectNum(int[][] Mtr, int k) {
        // bổ sung mã lệnh  
        for(int i=0;i<Mtr[0].length;i++)
            if(isPerfect(Mtr[k][i])) 
                System.out.print(i+" ");
        System.out.printf("\n");
    }
    
    
    /*  thực hiện tính và chuẩn 2 của cột thứ k của Mtr */
    public static double normCols(int[][] Mtr, int k) {
        int colNum = Mtr.length;
        int sumA = 0;
        for(int i=0; i<colNum; i++)
            sumA+= Mtr[i][k] * Mtr[i][k];
        return (double) Math.sqrt(sumA);
         // bổ sung mã lệnh - có thể thay đổi giá trị trả về nhưng cần đúng kiểu 
    }

    /* thực hiện việc tính và in chuẩn 2 của các cột trong Mtr ra màn hình */
    public static void printColsNorm(int[][] Mtr)  {
         for(int i=0; i<Mtr[0].length;i++)
         {
             System.out.printf("%.4f ", normCols(Mtr, i));
         }
         System.out.printf("\n");
    }
    
}


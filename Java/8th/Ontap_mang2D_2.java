/**
 * Hoàn thiện các phương thức trong lớp Ontap_mang2D_2 theo các yêu cầu 
 * như trong phần mô tả và đề bài. Các phương thức cần được giữ nguyên dạng
 * tên / danh sách tham đối/ kiểu trả về/ mẫu khai báo ....
 * Có thể bổ sung các phương thức khác nếu cần.
 * */
import java.util.Scanner;

public class Ontap_mang2D_2{

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
    
    static boolean isPalindrome(int n)
    {
        String tmp = Integer.toString(n);
        for(int i=0;i<tmp.length();i++)
            if(tmp.charAt(i)!=tmp.charAt(tmp.length()-i-1)) return false;
        return true;
    }

    /* liệt kê chỉ số cột của các phần tử là số đối xứng trong dòng thứ k ma trận Mtr */
    public static void listPalindrome(int[][] Mtr, int k) {
        // bổ sung mã lệnh  
        for(int i=0;i<Mtr[0].length;i++)
            if(isPalindrome(Mtr[k][i])) 
                System.out.print(i+" ");
        System.out.printf("\n");

    }
    
    /*  thực hiện tính và trả về giá trị trung bình các phần tử dòng thứ k của Mtr */
    public static double avgRows(int[][] Mtr, int k) {
         // bổ sung mã lệnh - có thể thay đổi giá trị trả về nhưng cần đúng kiểu
        double sum=0;
        for(int i=0;i<Mtr[0].length;i++)
            sum+= Mtr[k][i];
        return (sum/Mtr[0].length);
    }

    /* thực hiện việc tính và in giá trị trung bình các phần tử của các dòng trong Mtr ra màn hình */
    public static void printRowsAvg(int[][] Mtr)  {
        for(int i=0;i<Mtr.length;i++)
            System.out.printf("%.3f ", avgRows(Mtr, i));
        System.out.printf("\n");
    }
    
}

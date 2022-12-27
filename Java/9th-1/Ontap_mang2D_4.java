import java.util.Scanner;

public class  Ontap_mang2D_4{

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
        // bổ sung mã lệnh
        for(int[] arr : Mtr)
        {
            for(int val: arr)
                System.out.print(val + " ");
            System.out.println("");
        }
    }

    /* thực hiện kiểm tra trong ma trận Mtr có tồn tại hai cột trực giao với nhau */
    public static boolean isColsOrthgonal(int[][] Mtr) {
        int limit = Mtr[0].length;
        for(int i=0;i<limit-1;i++)
            for(int j=i+1;j<limit;j++)
            {
                int sum =0;
                for(int k=0;k<Mtr.length;k++)
                    sum+= Mtr[k][i] * Mtr[k][j];
                if(sum==0) return true;
            }
        return false;
    }
    
    /*  thực hiện tìm và trả về giá trị nhỏ nhất trong các phần tử dòng thứ k của Mtr */
    public static int minRowsMember(int[][] Mtr, int k) {
        int min = Mtr[k][0];
        for(int val : Mtr[k])
            if(val<min) min =val;
         // bổ sung mã lệnh - có thể thay đổi giá trị trả về nhưng cần đúng kiểu 
         return min;
    }

    /* thực hiện việc tính và in giá trị nhỏ nhất trong phần tử các dòng của Mtr ra màn hình */
    public static void printRowsMin(int[][] Mtr) {
         // bổ sung mã lệnh
         for(int i=0;i<Mtr.length;i++)
            System.out.printf("%d " , minRowsMember(Mtr, i));
        System.out.println("");
    }
    
}
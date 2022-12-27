/**
 * Chương trình nhập một số nguyên dương n và ma trận nguyên A kích thước n x n 
 * sau đó kiểm tra xem các phần tử của ma trận có giá trị từ 1 đến n*n hay không
 * Nếu đúng in ra màn hình thông báo "YES", nếu sai, in ra thông báo "NO"
 * **/
import java.util.*;
public class KiemtraMatran{
    public static void main( String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr2 = new int[n][n];
        for(int i=0; i<n;i++)
            for(int j=0;j<n;j++)
                arr2[i][j]=sc.nextInt();
        boolean[] check = new boolean[n*n+1];
        check[0]=true;
        for(int i=0; i<n;i++)
            for(int j=0;j<n;j++)
                check[arr2[i][j]]=true;
        for(boolean i : check) 
            if(!i) 
            {
                System.out.println("NO");
                sc.close();
                return;
            }
        System.out.println("YES");
        sc.close();
    }
    
    // viết mã lệnh ở đây
}
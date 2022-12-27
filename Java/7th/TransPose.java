
/**
 * Nhập M, N, và ma trận nguyên A cỡ M x N
 * Tìm và in ra ma trận chuyển vị của A
 * */
import java.util.*;
class TransPose{
    
    static int[][] chuyenVi(int[][] arr)
    {
        int m = arr.length, n= arr[0].length;
        int[][] res = new int[n][m];
        
        for(int i = 0; i < m; i++)
            for(int j = 0 ; j<n ; j++)
                res[j][i] = arr[i][j];
                
        return res;
    }
    
    static void printArr(int[][] arr)
    {
        for(int[] arr1 : arr)
        {
            for(int val : arr1) 
                System.out.print(val + " ");
            System.out.println("");
        }
    }
    
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt(), n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        for(int i=0; i<m ; i++)
            for(int j=0; j<n ; j++)
                arr[i][j] = sc.nextInt();
                
        sc.close();
        
        printArr( chuyenVi(arr) );
    }
}
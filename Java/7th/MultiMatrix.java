//Chương trình nhân 2 ma trận
import java.util.*;
public class MultiMatrix
{
    static int[][] multiArr(int[][] a, int[][] b)
    {
        int m = a.length, n=a[0].length;
        int[][] res = new int[m][m];
        
        for(int i=0; i<m ; i++)
            for(int j=0; j<m ; j++)
                for(int k=0; k < n; k++)
                    res[i][j] += a[i][k] * b[k][j];
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
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[n][m];
        
        for(int i=0; i<m ;i++)
            for(int j=0; j<n ; j++)
                arr1[i][j] = sc.nextInt();
        for(int i=0; i<n ;i++)
            for(int j=0; j<m ; j++)
                arr2[i][j] = sc.nextInt();
        sc.close();
        printArr(multiArr(arr1, arr2));
    }
}
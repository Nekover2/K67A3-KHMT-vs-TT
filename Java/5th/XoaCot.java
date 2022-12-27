import java.util.*;
 
class XoaCot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0 ; i< m; i++)
            for(int j=0; j<n ; j++)
                arr[i][j] = sc.nextInt();
        sc.close();
        //-================
        
        for(int i=0 ; i< m; i++)
        {
            for(int j=0; j<n ; j++)
                if(j!=k) System.out.printf("%d ", arr[i][j]);
            System.out.printf("\n");
        }
            
    }
}
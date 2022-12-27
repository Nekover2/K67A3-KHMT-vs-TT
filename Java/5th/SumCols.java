import java.util.*;
class SumCols{
    public static void main( String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] _Res = new int[n];
        int[][] arr = new int[m][n];
        for(int i=0 ; i<m ; i++)
            for(int j=0 ; j<n ; j++)
                arr[i][j] = sc.nextInt();
        sc.close();
        //end initiation
        for(int i=0 ; i<m ; i++)
            for(int j=0 ; j<n ; j++)
                _Res[j] += arr[i][j];
        for(int i: _Res) 
            System.out.printf("%d ", i);
        
    }
}
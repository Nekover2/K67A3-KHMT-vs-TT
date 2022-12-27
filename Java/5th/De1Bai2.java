import java.util.*;

public class De1Bai2
{
    //Components
    static boolean isEqualConlumn(int[][] arr, int a, int b)
    {
        int n = arr.length;
        for(int j=0 ; j<n ; j++)
            if(arr[a][j]!=arr[b][j]) return false;
        return true;
    }
    
    static boolean isPerfect(int n)
    {
        if( n <=1 ) return false;
        int sum =1;  
        for(int i = 2; i< Math.sqrt(n) ; i++)
            if(n%i==0) sum += i + n/i;
        if(n%Math.sqrt(n)==0) sum+= Math.sqrt(n);
        if(sum==n) return true;
        else return false;
    }
    
    //CHOICE
    static boolean luachon1(int[][] arr)
    {
        int n = arr.length;
        return isEqualConlumn(arr, 0, n-1);
    }
    
    static boolean luachon2(int[][] arr)
    {
        int n = arr.length;
        for(int i =0 ; i<n-1 ; i++)
            for(int j = i+1 ; j< n ; j++)
                if(isEqualConlumn(arr, i, j)) return true;
        return false;
    }
    static int luachon3(int[][] arr)
    {
        int _Res = Integer.MAX_VALUE;
        boolean flag = false;
        for(int[] i : arr)
            for(int j : i)
                if( j<_Res && isPerfect(j) ) 
                {
                    _Res = j;
                    flag = true;
                }
        if(flag) return _Res;
        else return -1;
    }
    static void luachon4(int[][] arr)
    {
        int[] a = arr[0];
        int[] count = new int[1000000];
        for(int i: a)
            count[i]++;
        for(int i: a)
            System.out.printf("%d ", count[i]);
    }
    ////
    
    
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int j = 0; j<n ; j++)
            for(int i=0; i <n ; i++ )
                arr[i][j] = sc.nextInt();
        int choice = sc.nextInt();
        sc.close();
        ///
        switch(choice)
        {
            case 1:
                if(luachon1(arr)) System.out.println("YES");
                else System.out.println("NO");
                break;
            case 2:
                if(luachon2(arr)) System.out.println("YES");
                else System.out.println("NO");
                break;
            case 3:
                System.out.println(luachon3(arr));
                break;
            case 4:
                luachon4(arr);
                break;
            default:
                break;
        }
    }
}
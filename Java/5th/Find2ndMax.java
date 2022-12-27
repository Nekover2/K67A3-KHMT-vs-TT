/**
 * Chương trình nhập m, n và ma trận nguyên A cỡ m x n
 * Tìm và in ra giá trị lớn thứ 2 của mỗi cột trong ma trận A
 * */
 
import java.util.*;

class Find2ndMax{
    static int F2ndMax_1(int[] arr)
    {
        int _Max = Integer.MIN_VALUE, _2ndMax = Integer.MIN_VALUE;
        for(int i : arr)
            if(i > _Max)
            {
                _2ndMax = _Max;
                _Max = i;
            }
            else if(i > _2ndMax) _2ndMax = i;
        return _2ndMax;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner( System.in );
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0 ; i<m ; i++)
            for(int j=0 ; j<n ; j++)
                arr[i][j] = sc.nextInt();
        sc.close();
        
        //------------
        
        int[] _Max = new int[n], _2ndMax = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            _Max[i] = Integer.MIN_VALUE; _2ndMax[i] = Integer.MIN_VALUE;
        }
        for(int i=0 ; i<m ; i++)
            for(int j=0 ; j<n ; j++)
                if(arr[i][j] > _Max[j])
                {
                    _2ndMax[j] = _Max[j];
                    _Max[j] = arr[i][j];
                }
             else if(arr[i][j] > _2ndMax[j] && arr[i][j]!=_Max[j]) _2ndMax[j] = arr[i][j];
        for(int i : _2ndMax) 
            System.out.printf("%d ", i);
    }
    // bổ sung mã lệnh ở đây
}
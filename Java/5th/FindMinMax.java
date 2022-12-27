/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng, 
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
//import <libraries needed here>
import java.util.*;


public class FindMinMax{
    
    public static int findMin(int Array[]){
        int _min = Integer.MAX_VALUE;
        for( int i : Array )
            if( _min > i ) _min = i;
        return _min;
        //editing here
    }
    
    public static int findMax(int Array[]){
        //editing here
        int _max = Integer.MIN_VALUE;
        for( int i : Array )
            if( _max < i ) _max = i;
        return _max;
    }
    
    public static void main(String args[]){
        // editing here
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n; i++ )
            arr[i] = sc.nextInt();
        sc.close();
        System.out.printf("%d %d\n", findMin(arr), findMax(arr) );
    }
    
}
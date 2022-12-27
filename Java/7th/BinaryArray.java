/**
 * TÌm biểu diễn nhị phân của số nguyên
 * Có thể dùng phương pháp lặp hoặc đệ quy
 * */
 import java.util.*;
 public class BinaryArray
 {
    static String getBinary(int n)
    {
        String _Res = "";
        while(n!=0)
        {
            _Res =  Integer.toString(n%2) + _Res;
            n= (int)( n/2 );
        }
        return  _Res=="" ? "0" : _Res;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(getBinary(n));
    }
 }
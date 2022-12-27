/**
 * Hoàn thiện các phương thức trong lớp ArrayUtils theo các yêu cầu 
 * như trong phần mô tả và đề bài. Các phương thức cần được giữ nguyên dạng
 * tên / danh sách tham đối/ kiểu trả về/ mẫu khai báo ....
 * */
import java.util.*;
public class ArrayUtils{
    
    ///component
    
     static boolean isPalindrome(int n)
    {
        // begin edit
        String s = String.valueOf(n);
        int len = s.length();
        for(int i=0;i<= len/2;i++)
            if(s.charAt(i) != s.charAt(len-1-i) ) return false;
        return true;
    }
    
    private static boolean isPrimeModded( int n )
    {
        for(int i =2; i<= Math.sqrt(n); i++) 
            if( n % i ==0 ) return false;
        return true;
    }
    
    
    
    private static void analyze( int n )
    {
        int i=2;
        while(n>1){
            if(isPrimeModded(i)){
                if(n%i==0){
                    System.out.print(i+" ");
                    n/=i;
                }
                else 
                    i++;
            }
            else 
                i++;
        }
    }
    
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
    
    //thực hiện đọc và trả lại mảng n số nguyên
    public static int[] readArray(Scanner reader){
        
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n ; i++) arr[i] = reader.nextInt();
        return arr; //Cần thay đổi giá trị trả về nhưng phải cùng kiểu int[]
    }

    //kiểm tra một dãy số nguyên có lập thành cấp số cộng với công sai chẵn hay không
    public static boolean isEvenArithmetic(int[] arr){
        
        for(int i =2 ;i< arr.length-1 ; i++)
            if((arr[i] - arr[i-1])%2 !=0 || (arr[i] - arr[i-1]) != (arr[i-1] - arr[i-2]) ) return false;
        return true; //Có thể thay đổi giá trị trả về nhưng phải cùng kiểu
    }
    
    
    //đếm số lượng các số đối xứng có trong dãy
    public static int countPalindromeNumbers(int[] arr){
        int count = 0;
        for( int i : arr )
            if( isPalindrome(i) ) count++;
        return count; 
    }
    

    //phân tích số lớn thứ hai trong mảng thành tích của các thừa số nguyên tố
    public static void analysis2ndMax(int[] arr){
        int num = F2ndMax_1(arr);
        if(num>2)
            analyze(num);
        else
            System.out.print("NONE");
    }       

    // Tìm và trả về dãy con liên tiếp tăng dài nhất
    public static int[] findLongestSequence(int[] arr) {
        
        // bổ sung mã lệnh ở đây
        int max = 1, maxEnd = 0;
        int cnt = 1;
        for(int i=1;i<arr.length;i++)
            if(arr[i]>arr[i-1])
                cnt++;
            else
            {
                if(cnt>max)
                {
                    max = cnt;
                    maxEnd = i;
                }
                cnt = 1;
            }
        if(cnt>max)
        {
            max = cnt;
            maxEnd = arr.length -1;
        }
        return Arrays.copyOfRange(arr, maxEnd - max, maxEnd); //Cần thay đổi giá trị trả về nhưng phải cùng kiểu int[]
     }
    public static void main(String args[])
    {
        
    }
}

import java.util.Scanner;
class test
{
    private static boolean isPrimeModded( int n )
    {
        for(int i =2; i<= Math.sqrt(n); i++) 
            if( n % i ==0 ) return false;
        return true;
    }
    
    private static int getInput()
    {
        Scanner sc = new Scanner(System.in);
        int _tmp = sc.nextInt();
        sc.close();
        return _tmp;
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
    
    public static void main( String args[])
    {
        analyze(getInput());
    }
}
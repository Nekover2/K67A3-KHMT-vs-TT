
public class Function {
		
	public static int sum(int[] a)
	{
	    int sum = 0;
	    for(int i : a) sum += i;
		return sum;
	}	
	
	public static int maxOdd(int[] a)
	{
	    int _max = Integer.MIN_VALUE;
	    boolean check = false;
	    for(int i : a)
	        if( _max < i && i%2 == 1)
	        {
	            _max = i;
	            check = true;
	        }
		if(check) return _max;
		else return -1;
	}
	
	public static int minEven (int[] a)
	{
	    int _min = Integer.MAX_VALUE;
	    boolean check = false;
	    for(int i : a)
	        if( _min > i && i%2 == 0 )
	        {
	            _min = i;
	            check = true;
	        }
		if(check) return _min;
		else return -1;
	}
		

	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		System.out.println("Tong cac phan tu trong mang la: "+sum(a));
		
		System.out.println("So le lon nha la: "+maxOdd(a));
		
		System.out.println("So chan mho nha la: "+minEven(a));
		
		String s = "a123abcbsbasdcaac3ABCXaxddsa";
		
	
		
	}

}

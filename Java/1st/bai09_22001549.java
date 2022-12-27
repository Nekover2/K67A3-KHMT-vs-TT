public class bai09_22001549 {
    public static void main(String[] args)
	{	
		 Double _Num = Double.parseDouble(args[0]);
		 Double _Inch = (Double)(Math.round( ((_Num * 39.3700787)*100.00))/100.00 );
		 System.out.println(_Inch);
	}
}

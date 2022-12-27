public class bai16_22001549 {
    public static void main(String[] args)
	{	
		Double _Num1 = Double.parseDouble(args[0]);
		Double _Num2 = Double.parseDouble(args[1]);
		Double _Num3 = Double.parseDouble(args[2]);
		System.out.print("Day 3 so the thu tu tang dan: "+ Math.min(Math.min(_Num1, _Num2), _Num3) + ", " + Math.min(Math.max(_Num1, _Num2), _Num3) + ", " + Math.max(Math.max(_Num1, _Num2), _Num3));
	}
}

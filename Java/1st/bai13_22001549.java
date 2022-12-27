public class bai13_22001549 {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int _Min = Math.min(Math.min(a,b), c);
		int _Max = Math.max(Math.max(a, b), c);
		int _Mid = a + b + c - _Min - _Max;
        //do as
        boolean _isOrdered = _Mid == b ? true : false;
        System.out.println(_isOrdered);
    }
}
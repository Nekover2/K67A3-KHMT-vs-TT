public class Count
{
    int dynamicInt = 0;
    static int staticInt = 0;
    void inc()
    {
        dynamicInt++;
        staticInt++;
    }
    public static void main(String[] args) {
        Count cnt1 = new Count();
        cnt1.inc();
        System.out.println(cnt1.toString());
    }
}
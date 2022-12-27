import java.util.*;
public class test {
    static void getArr( int[] i)
    {
        Scanner sc = new Scanner(System.in);
        i[0] = sc.nextInt();
        sc.close();
    }
    public static void main(String[] args) {
        int[] i = new int[5];
        getArr(i);
        System.out.println(i[0]);
    }
}

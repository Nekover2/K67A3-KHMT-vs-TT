package neko.oop.lab8;
import java.util.*;
public class Lists {

    public static void insertFirst (List<Integer> list, int val) {
        list.add(0,val);
    }

    public static void insertLast(List<Integer> list, int val) {
        list.add(val);
    }

    public static void replace(List<Integer> list, int val) {
        list.set(3, val);
    }

    public static void removeThird(List<Integer> list) {
        list.remove(3);
    }

    public static List<Integer> generateSquare() {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            res.add(i*i);
        }
        return res;
    }

    public static boolean contains(List<Integer> list, int val) {
        for(Integer listValues : list)
        {
            if(listValues == val) return true;
        }
        return false;
    }

    public static void copy(List<Integer> src, List<Integer> target) {
        target = new ArrayList<>(src);
    }

    public static void reverse(List<Integer> src) {
        Collections.reverse(src);
    }
    public static void reverseManual(List<Integer> src) {
        if(src == null ||src.isEmpty()) return;
        for (int i = 0; i < (src.size()-1)/2; i++) {
            int tmp = src.get(i);
            int opposite = src.size() -1-i;
            src.set(i, src.get(opposite));
            src.set(opposite, tmp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int val) {
        list.offerLast(val);
        list.offerFirst(val);
    }
}

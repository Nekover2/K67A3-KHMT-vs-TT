package neko.oop.lab9.MyMap;

public class TestApp {
    public static void main(String[] args) {

        MyMap m = new MyHashMap();
        m.put(11, "Nicola");
        m.put(11, "Nicola");
        m.put(21, "Marzia");
        m.put(31, "Giovanni");
        m.put(41, "Giovanni");
        m.put(51, "Giovanni");
        m.remove(21);
        System.out.println(m.contains(11));
        System.out.println(m.contains(77));
        System.out.println(m.size());
        System.out.println(m);
    }
}
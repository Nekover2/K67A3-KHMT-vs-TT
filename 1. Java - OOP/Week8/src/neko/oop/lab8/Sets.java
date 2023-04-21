package neko.oop.lab8;

import java.util.*;
public class Sets {
    public static  Set<Integer> unionManual(Set<Integer> first,
                                            Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        for (Integer secondElement : second) {
            if(!result.contains(secondElement)) {
                result.add(secondElement);
            }
        }
        return result;
    }

    public static Set<Integer> intersectionManual(Set<Integer> first,
                                                  Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for(Integer firstElement : first) {
            if(second.contains(firstElement)) result.add(firstElement);
        }
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first,
                                            Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>(first);
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first,
                                            Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>(first);
        result.addAll(second);
        return result;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> tmp = new HashSet<Integer>(source);
        return new ArrayList<>(tmp);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
            Set<Integer> tmp = new HashSet<Integer>();
            for(Integer value : source){
                tmp.add(value);
            }
            return toList(tmp);
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> tmp = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            Character tmpChar = s.charAt(i);
            if (tmp.contains(tmpChar)) {
                return Character.toString(tmpChar);
            } else {
                tmp.add(tmpChar);
            }
        }
        return "";
    }

    public static String allRecurringCharacter(String s) {
        Set<Character> tmp = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            Character tmpChar = s.charAt(i);
            if (tmp.contains(tmpChar)) {
                result.add(tmpChar);
            } else {
                tmp.add(tmpChar);
            }
        }
        return result.toString();
    }

    public static Integer[] toArray(Set<Integer> src) {
        if (src == null || src.size() == 0) return null;
        Integer[] result = new Integer[src.size()];
        int index = 0;
        for(Integer value : src) {
            result[index] = value;
            index++;
        }
        return result;
    }

    public static int getFirst(TreeSet<Integer> src) {
        if (src == null || src.size() == 0) return Integer.MIN_VALUE;
        return src.first();
    }

    public static int getLast(TreeSet<Integer> src) {
        if (src == null || src.size() == 0) return Integer.MIN_VALUE;
        return src.last();
    }

    public static int getLast(TreeSet<Integer> src, int value) {
        if (src == null || src.size() == 0) return Integer.MIN_VALUE;
        if(src.higher(value) == null) return Integer.MIN_VALUE;
        return src.higher(value);
    }
}

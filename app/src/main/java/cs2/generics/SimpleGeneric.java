package cs2.generics;

import java.util.ArrayList;

public class SimpleGeneric {
    
    public static ArrayList<Integer> arrayToAraryList(int[] a) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : a) {
            al.add(i);
        }
        return al;
    }

    public static <T> ArrayList<T> arrayToAraryList(T[] a) {
        ArrayList<T> al = new ArrayList<>();
        for(T i : a) {
            al.add(i);
        }
        return al;
    }

    public static void main(String[] args) {
        Integer[] i = {1,2,3,4};
        Double[] d = {1.2, 3.4, 5.6, 7.8};

        System.out.println(i);
        System.out.println(d);
        System.out.println(arrayToAraryList(i));
        System.out.println(arrayToAraryList(d));
    }




}

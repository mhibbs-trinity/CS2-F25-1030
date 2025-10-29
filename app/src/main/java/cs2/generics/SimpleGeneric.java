package cs2.generics;

import java.util.ArrayList;

class Student implements Comparable<Student> {
    public String name;
    public double gpa;
    public int id;
    public Student(String n, double g, int i) {
        name = n; gpa = g; id = i;
    }
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
        // if(this.gpa < other.gpa) return -1;
        // else if(this.gpa > other.gpa) return 1;
        // else return 0;
    }
}

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

    // public static void bubbleSort(int[] a) {
    //     for(int j=0; j<a.length; j++) {
    //         for(int i=0; i<a.length-1; i++) {
    //             if(a[i] > a[i+1]) {
    //                 int tmp = a[i];
    //                 a[i] = a[i+1];
    //                 a[i+1] = tmp;
    //             }
    //         }
    //     }
    // }

    public static <T extends Comparable<T>> void bubbleSort(T[] a) {
        for(int j=0; j<a.length; j++) {
            for(int i=0; i<a.length-1; i++) {
                if(a[i].compareTo(a[i+1]) > 0) {
                    T tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Double[] i = {5.0,3d,2.0,8.0,4d,6d,1d,9d};

        for(Double x : i) System.out.print(x + ",");
        System.out.println();
        bubbleSort(i);
        for(Double x : i) System.out.print(x + ",");

        Student[] s = new Student[3];
        s[0] = new Student("Sally", 4.0, 1234);
        s[1] = new Student("Bob", 2.0, 2314);
        s[2] = new Student("Cindy", 1.5, 9992);

        for(Student x : s) System.out.print(x.name + ",");
        System.out.println();
        bubbleSort(s);
        for(Student x : s) System.out.print(x.name + ",");
        


        // Double[] d = {1.2, 3.4, 5.6, 7.8};

        // System.out.println(i);
        // System.out.println(d);
        // System.out.println(arrayToAraryList(i));
        // System.out.println(arrayToAraryList(d));
    }




}

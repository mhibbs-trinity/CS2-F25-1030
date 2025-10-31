package cs2.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        System.out.println(s);
        s.add("Hello");
        s.add("Goodbye");
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.remove("Hello");
        System.out.println(s);
        s.add("QQ");
        s.add("QQ");
        s.add("QQ");
        System.out.println(s);
        s.remove("Hat");
        System.out.println(s);
        System.out.println(s.contains("QQ"));

        HashSet<String> s2 = new HashSet<>();
        s2.add("QQ");
        s2.add("OverThere");
        s2.add("Hello");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s.addAll(s2));
        System.out.println(s);

        Iterator<String> it = s.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            System.out.println("**" + it.next() + "**");
        }



    }
}

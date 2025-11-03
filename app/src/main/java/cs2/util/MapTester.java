package cs2.util;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<String,Integer>();
        System.out.println(m);
        m.put("Hello", 0);
        m.put("Good", 42);
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.containsKey("Hello"));
        System.out.println(m.containsValue(12));
        m.remove("Good");
        System.out.println(m);
        m.put("What",13);
        m.put("What", 27);
        System.out.println(m);
        System.out.println(m.remove("What"));
        System.out.println(m);
        m.put("What", 27);
        m.put("Who?", 33);
        m.put("Apple", 12);
        m.put("Banana", 14);

        for(String key : m.keySet()) {
            System.out.println(key + " -> " + m.get(key));
        }

    }
}

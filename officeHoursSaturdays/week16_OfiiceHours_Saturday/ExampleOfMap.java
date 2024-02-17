package week16_OfiiceHours_Saturday;

import java.util.*;

public class ExampleOfMap {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("one", 1);
        map1.put("three", 3);
        map1.put("zero", 0);
        map1.put("java", 11);
        map1.put("one", 11); // update the value
        map1.put(null, -1);
        map1.put("*abc", null);
        map1.put("5five", 5);

        System.out.println(map1);

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("one", 1);
        map2.put("three", 3);
        map2.put("zero", 0);
        map2.put("java", 11);
        map2.put("one", 11); // key are unique, update the value
        map2.put(null, -1);
        map2.put("*abc", null);
        map2.put("5five", 5);

        System.out.println(map2);

        Map<String, Integer> map3 = new TreeMap<>(); // sort by key
        map3.put("one", 1);
        map3.put("three", 3);
        map3.put("Zero", 0);
        map3.put("java", 11);
        map3.put("one", 11); // update the value
        //map3.put(null, -1); // null not allowed in TreeMap
        map3.put("*abc", null); // null value is okay
        map3.put("5five", 5);

        System.out.println(map3);

        Map<String, Integer> map4 = new Hashtable<>(); // synchronized
        map4.put("one", 1);
        map4.put("three", 3);
        map4.put("Zero", 0);
        map4.put("java", 11);
        map4.put("one", 11); // update the value
        //map4.put(null, -1); // null key and value not allowed
        //map4.put("*abc", null); // null key and value not allowed
        map4.put("5five", 5);

        System.out.println(map4);

    }
}
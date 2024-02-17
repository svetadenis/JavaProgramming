package week16_OfiiceHours_Saturday;

import week14_OfficeHours_Saturdays.clothes.Clothes;

import java.util.*;

public class DBExample {
    public static void main(String[] args) {

        // each person is their own map

        Map<String, Object> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", 40);

        System.out.println(person1.keySet()); // a Set of the keys
        System.out.println(person1.values()); // Collection of values

        Map<String, Object> person2 = Map.of("FIRST_NAME", "Anna", "LAST_NAME", "Jane", "AGE", 25); // immutable map -> we cannot change it
        System.out.println(person2);

        Map<String, Object> person3 = Map.of("FIRST_NAME", "Molly", "LAST_NAME", "Smith", "AGE", 40);

        List<String> list = new ArrayList<>(); // element type is String
        List<Clothes> list2 = new ArrayList<>(); // element type is Clothes

        List<Map<String, Object>> db = new ArrayList<>(Arrays.asList(person1, person2, person3));

        System.out.println(db.get(1)); // gives me the map for person2
        System.out.println(db.get(1).get("FIRST_NAME")); // gives me the FIRST_NAME value for person2

    }
}
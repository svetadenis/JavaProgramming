package week16_OfiiceHours_Saturday;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        // continent - countries
        // key - String
        // value - List<String>

        Map<String, List<String>> world = new HashMap<>();
        world.put("North America", new ArrayList<>(Arrays.asList(
                "Canada", "Mexico", "United States"
        ))); // created a new ArrayList with some String - countries

        world.put("Europe", new ArrayList<>(Arrays.asList(
                "UK", "Italy", "Spain", "France", "Germany", "Bosnia"
        )));

        System.out.println(world);

        // iterate through the continents (keys)

        for(String key : world.keySet()){
            System.out.println(key); // prints the key - continent
            System.out.println(world.get(key)); // read the value based on the key -> List of countries
        }

        // iterate through all the countries one at a time

        for(List<String> eachValue : world.values()){ // values method returns all the values from the map as a Collection of the values -> in this case Collection<List<String>>
            for(String eachCountry : eachValue){ // this loop goes through each List<String> and print each country on its own line
                System.out.println(eachCountry);
            }
        }

        // iterate through the entries

        for(Map.Entry<String, List<String>> eachEntry: world.entrySet()) { // entrySet returns a Set of the Entries
            System.out.println(eachEntry.getKey());
            System.out.println(eachEntry.getValue());
        }

        // forEach method
        System.out.println("---------------");
        world.forEach((k, v) -> System.out.println(k + " " + v));

    }}

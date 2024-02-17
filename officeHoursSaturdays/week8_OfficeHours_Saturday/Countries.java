package week8_OfficeHours_Saturday;

import java.util.Arrays;
public class Countries {
    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        // Find and print all the first and last characters
        for(int i = 0; i < countries.length; i++){
            String each = countries[i];
            System.out.println(each.charAt(0) + " " + each.charAt(each.length()-1));
            // System.out.println(countries[i].charAt(0) + " " + countries[i].charAt(countries[i].length()-1));
        }

        for(String each : countries){
            System.out.println(each.charAt(0) + " " + each.charAt(each.length()-1));
        }

        System.out.println("-----------------------------------------------");
        //Find the largest and smaller countries based on the length of their names
        String maxCountry = countries[0];
        String minCountry = countries[0];

        for(String country : countries){
            if(country.length() > maxCountry.length()){
                maxCountry = country;
            } else if(country.length() < minCountry.length()){
                minCountry = country;
            }
        }

        System.out.println(maxCountry);
        System.out.println(minCountry);

        System.out.println("-----------------------------------------------");
        // Show all the countries that start with a 'C'

        String countriesWithC = "";
        for(String eachCountry : countries){
            if(eachCountry.startsWith("C")){
                System.out.println(eachCountry);
                countriesWithC += eachCountry + "-";
            }
        }

        // also give back an array of countries that start with C
        String[] countryArrForC = countriesWithC.split("-");
        System.out.println(countriesWithC);
        System.out.println(Arrays.toString(countryArrForC));
        // countryArrForC[1] -> cuba

        System.out.println("-----------------------------------------------");
        // - Show all the countries that end with an 's'
        for(String eachCountry : countries){
            if(eachCountry.endsWith("s")){
                System.out.println(eachCountry);
            }
        }

    }
}
/*
Countries [array, String, loops]

    Create a program that defines an array of countries. Use the countries defined below or create your own array that has different country names. Use the countries to display different information defined in the mini tasks

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

	- Find and print all the first and last characters

	- Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'

 */


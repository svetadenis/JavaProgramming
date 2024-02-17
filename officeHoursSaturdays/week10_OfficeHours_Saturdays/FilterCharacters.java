package week10_OfficeHours_Saturdays;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterCharacters {
    public static void main(String[] args) {
        String str = "abcd@!#$etyi123lkjhaqwer%^&879";
        //ArrayList<Character> base = new ArrayList<>(Arrays.asList(str.toCharArray())) this doesn't work because we get back a char[] as primitive types
        ArrayList<String> base = new ArrayList<>(Arrays.asList(str.split(""))); // we split the String to get each character to be an element of the ArrayList. those elements are still String type. this ArrayList will not be changed at all
        ArrayList<String> digits = new ArrayList<>(base); // for each type we want to filter we are copying the base set of characters and removing based on the defined boolean
        digits.removeIf(p -> !Character.isDigit(p.charAt(0))); // p will be each character (as a String). the removeIf method will remove elements when the given boolean is true. each element is checked, and so if the element is not a digit (!Character.isDigit is true) the element will be removed which only leaves the digit character (1-9)

        ArrayList<String> letters = new ArrayList<>(base);
        letters.removeIf(p -> !Character.isLetter(p.charAt(0)));

        ArrayList<String> special = new ArrayList<>(base); // this one could have also been done with a lambda, but just to practice we used the bulk operations methods
        special.removeAll(digits);
        special.removeAll(letters);

        System.out.println("digits: " + digits);
        System.out.println("letters: " + letters);
        System.out.println("special: " + special);

    }
}
/*
Filter Characters [ArrayList, Wrapper class, loop, boolean]

    Create a program that will have a String of different characters, of different types. Filter(group) all the digits, letters, and special characters

        ex:
            String str = "abcd@!#$etyi123lkjhaqwer%^&879";
            digits: 123879
            letters: abcdetyilkjhaqwer
            special: @!#$%^&
 */
package week10_OfficeHours_Saturdays;

import utilities.ArrayListUtil;

import java.util.ArrayList;

public class FilterCharacters2 {
    public static void main(String[] args) {

        // in this version we have a ArrayList of characters -> so we don't need anything extra in each method call like we did in the first version (we had to do p.charAt(0)

        String str = "abcd@!#$etyi123lkjhaqwer%^&879";

        //ArrayList<Character> base = new ArrayList<>(Arrays.asList(str.toCharArray())) this doesn't work because we get back a char[] as primitive types
        // we don't know a way to convert the String into a ArrayList of Characters so we made a custom method in the ArrayListUtil class
        ArrayList<Character> base = ArrayListUtil.strToCharacterList(str);

        ArrayList<Character> digits = new ArrayList<>(base);
        digits.removeIf(p -> !Character.isDigit(p));

        ArrayList<Character> letters = new ArrayList<>(base);
        letters.removeIf(p -> !Character.isLetter(p));

        ArrayList<Character> special = new ArrayList<>(base);
        special.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println("digits: " + digits);
        System.out.println("letters: " + letters);
        System.out.println("special: " + special);
    }
}
package week8OfficeHours;

public class T4SortedOrder {
    public static boolean strIsSorted(String str){ // a b y z

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) > str.charAt(i + 1)){
                return false;
            }
        }

        return true;
    }

}
/*
T4SortedOrder [loop, String, method]

    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetical order
        return false if the given String is not sorted

    Ex:
        input: "abcd"
        output: true

        input: "abzy"
        output: false
 */


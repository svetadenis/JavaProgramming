package week9OfficeHours;
import java.util.Arrays;

public class T6ReverseEach {
    public static void main(String[] args) {
        String[] arr = {"can", "you", "join", "the", "team"};
        System.out.println(Arrays.toString(reverseEach(arr)));

        createArrayCode("can, you, join, the, team"); // use this method to get the code that you can copy somewhere and use it

    }

    public static String[] reverseEach(String[] arr){
        String eachReversed = "";

        for(String eachWord : arr){
            eachReversed += reverse(eachWord) + ", ";
        }

        return eachReversed.split(", ");
    }

    public static String[] reverseEach2(String[] arr){ // "can", "you", "join", "the", "team"
        String[] eachReversed = new String[arr.length]; // [ nac, ouy ...   ]

        for(int i = 0; i < arr.length; i++){
            eachReversed[i] = reverse(arr[i]);
        }

        return eachReversed;
    }

    public static String reverse(String str){
        String s = "";
        for(int i = str.length() -1; i >= 0; i--){
            s += str.charAt(i);
        }
        return s;
    }

    public static String[] createArray(String s){ //can, you, join, the, team
        String[] arr = s.split(", ");
        return arr;
    }

    public static void createArrayCode(String s){ /// {"can", "you", "join", "the", "team"};
        String[] arr = s.split(", ");
        String code = "{ ";
        for(String each : arr){
            code += "\"" + each + "\", ";
        }
        System.out.println(code.substring(0, code.length() - 2) + " };");
    }


}
/*
T6ReverseEach [array, loop, String]

    Create a program that will define a String array with some words. Reverse each given element and assign them to a new array for all the reverse words

    Ex:
        {can, you, join, the, team} -> [nac, uoy, nioj, eht, meat]

 */


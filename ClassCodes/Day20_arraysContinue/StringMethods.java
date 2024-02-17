package Day20_arraysContinue;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

    String str = "Cydeo School";

    char[] ch = str.toCharArray();

    System.out.println(Arrays.toString(ch));//[C, y, d, e, o,  , S, c, h, o, o, l]
    System.out.println("________________________________________");

    String str2 = "Today is a great day";
   String [] words = str2.split(" ");

    System.out.println(Arrays.toString(words));//[Today, is, a, great, day]

        System.out.println("_______________________________________");

    String sentence = "I love Java";

    String arr [] = ArraysUtility.reverse(sentence.split(""));
    System.out.println(Arrays.toString(arr));
    String reversedSentence = " ";//"Java love I"
        for (int i = 0; i < arr.length; i++) {
            reversedSentence=reversedSentence+arr[i]+" ";
    System.out.println(reversedSentence);
            
        }




    }

}

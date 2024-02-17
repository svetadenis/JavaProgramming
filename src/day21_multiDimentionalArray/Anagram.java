package day21_multiDimentionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

    String str1 = "heart";//"aehtr"
    String str2 = "earth";//"aehtr"

//String[] a1 =str1.split("");//each element of the string become element of array
char[] a1 = str1.toCharArray();
char[] a2 = str2.toCharArray();
System.out.println(Arrays.toString(a1));//[h, e, a, r, t]
System.out.println(Arrays.toString(a2));//[e, a, r, t, h]

Arrays.sort(a1);
Arrays.sort(a2);

System.out.println(Arrays.toString(a1));//[a, e, h, r, t]
System.out.println(Arrays.toString(a2));//[a, e, h, r, t]

boolean isAnagram = Arrays.equals(a1,a2);
System.out.println("isAnagram = "+isAnagram);//true










    }
}


/*
Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false
 */
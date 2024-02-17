package day17_customClass;

import java.sql.SQLOutput;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";//a2b1c3d1
        //                   a b c d
        //                   2 1 3 1

    for (int j = 0; j<str.length();j++) {

        char ch = str.charAt(j);//a
        int count = 0;//this variable will count how many times particular character will be count in a string

        for (int i=0; i<str.length();i++){//loop for checking the character in a string
            if(str.charAt(i)==ch){
                count++;
            }
        }
        if(result.contains(""+ch)) {//if the character already included in the result
            continue; //skip that character
        }
        result+=ch+ "" +count;//a:2 we can meet character a two times in a string
    }
        System.out.println(result);
    //how to find the frequency of one character, and then the frequency of every character

}}



/*
	2. Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */

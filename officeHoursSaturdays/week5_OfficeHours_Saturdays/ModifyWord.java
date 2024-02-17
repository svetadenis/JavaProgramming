package week5_OfficeHours_Saturdays;

import java.util.Scanner;

public class ModifyWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next().trim().toLowerCase();
        input.close();

        /*
        step by step, calling one method each line
        String word = input.next();
        input.close();
        word = word.toLowerCase();
        word = word.trim();
         */

//        int lastIndex = word.length() - 1;
//        if(word.charAt(0) == word.charAt(lastIndex)){
//            word = word.substring(1, lastIndex); // the last index is not included
//        } else {
//            word = word.replace(word.charAt(0), '*').replace(word.charAt(lastIndex), '#');
//        }
//
//        System.out.println(word);

        // solution 2
        int lastIndex = word.length() - 1;
        boolean areSame = word.charAt(0) == word.charAt(lastIndex);
        word = word.substring(1, lastIndex); // keeps all the character expect for the first and last character

        if(!areSame){
            word = "*" + word + "#";
        }

        System.out.println(word);

    }
}
/*
ModifyWord [indexes, conditional]

	Create a program that will ask the user to enter a word. Check if the word starts and ends with the same character. If they are the same delete those characters

	if the characters we not the same replace the first character to be '*' and the last character to be #

	print the results
 */
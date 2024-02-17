package week6OfficeHours;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String word = input.next().toLowerCase(); //apple  5 / 2 -> 2 | java  4 / 2 = 2
        input.close();

        String result = "";
        int middle = word.length() / 2; // 6 / 2 = 3

        if (word.length() % 2 == 0) { // even -> 2 middle chars
            result = word.substring(0, middle - 1); // the first part up until the middle
            result += word.substring(middle - 1, middle + 1).toUpperCase();  //(word.charAt(middle - 1) + "" + word.charAt(middle)).toUpperCase()
        } else { // odd -> 1 middle char
            result = word.substring(0, middle);
            result += ("" + word.charAt(middle)).toUpperCase(); //word.substring(middle, middle + 1).toUpperCase();
        }

        result += word.substring(middle + 1); // moves the index to the char after the middle

        System.out.println(result);
    }
}
/*
Left over from review

MiddleCharacters [indexes, cases, length]

	Create a program that will ask the user to enter a word. Return the word in lowercase expect for the middle character/s in uppercase

	Note: based on if the word is even or odd there will be either two middle characters(even length) or one middle character (odd length)

	Ex:
		input:
			apple
		output:
			apPle

		input:
			JavA
		output:
			jAVa
 */


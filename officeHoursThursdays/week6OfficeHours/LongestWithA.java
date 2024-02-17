package week6OfficeHours;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 words:");
        String word1 = input.next(); // house
        String word2 = input.next(); // java
        String word3 = input.next(); // apple
        input.close();

        String longestWithA = ""; // "character"

        if (word1.contains("a") && word1.length() > longestWithA.length()) {
            longestWithA = word1;
        }

        if (word2.contains("a") && word2.length() > longestWithA.length()) {
            longestWithA = word2;
        }

        if (word3.contains("a") && word3.length() > longestWithA.length()) {
            longestWithA = word3;
        }

        System.out.println(longestWithA.isEmpty() ? "No word contained 'a'" : "longest word: " + longestWithA);

    }
}

/*

T5LongestWithA [Scanner, String, conditional, logical]

	Create a program that will ask the user to enter 3 words. Find the word that contains 'a' and is the longest out of the others

	ex:
		java
		mouse
		computer

	Output: java

	Extra: Instead of just checking for "a" ask the enter to enter the character that should be used to determine the result
 */


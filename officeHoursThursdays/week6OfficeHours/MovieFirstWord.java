package week6OfficeHours;

import java.util.Scanner;

public class MovieFirstWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine().trim();

        // what if the user enters only one word

        if (!sentence.contains(" ")) {
            System.out.println("Please try again with multiple words");
            sentence = input.nextLine().trim();
        }

        input.close();

        System.out.println("original: " + sentence);
        int space = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, space); // looking for the index of the space character
        System.out.println(firstWord);
        System.out.println("moved: " + sentence.substring(space + 1) + " " + firstWord);

    }
}
/*

T4MoveFirstWord [String, Scanner]

    create a program that will ask the user to enter a sentence. Print the sentence with the first word moved to the end

    Input:
        Java is a fun language
    Output:
        is a fun language Java
 */


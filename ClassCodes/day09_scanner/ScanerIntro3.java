package day09_scanner;

import java.util.Scanner;

public class ScanerIntro3 {
    public static void main(String[] args) {

       // int x = 5 (like this in line 9;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String whatever = input.next();
        char ch = whatever.charAt(0);
        //                            0th simbol
       // System.out.println("You have entered: " +ch);

        System.out.println("Would you like to continue?");
        String answer = input.next();//I do not know=>I
        //String answer = input.nextLine();//I do not know=>I do not know

        System.out.println("You have entered: " +answer);



    }

}

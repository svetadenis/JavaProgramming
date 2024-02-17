package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number:");
        float num1 = input.nextFloat();

        System.out.println("Enter your second decimal number");
        double num2 = input.nextDouble();

        System.out.println("Enter true or false:");
        boolean r = input.nextBoolean();

        System.out.println("num1 + " +num1);
        System.out.println("num2 = " +num2);
        System.out.println("r = "+r);
        input.close();

    }
}
/*
Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even
 */
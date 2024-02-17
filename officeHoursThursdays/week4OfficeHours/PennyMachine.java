package week4OfficeHours;

import java.util.Scanner;

public class PennyMachine {

    public static void main(String[] args) {

        //1) define the total number of cents, these are all pennies at the beginning
        //int x = 5; the same is
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of cents you have");
        int inputCents = input.nextInt(); // 1134
        input.close();
        // if you didn't want to use Scanner, instead just declare the cents: int cents = 100;

        if (inputCents > 0) {

            //2) define all the currency types I can use: dollars, quarters, dimes, nickels, and left over pennies
            int dollars, quarters, dimes, nickles, pennies;
            /*
            int dollars =0;  int nickles=0;
            int quarters = 0; int pennies=0;
            int dimes =0;
             */

            //3) I will start with the biggest type I can return, which is dollars.
            // I will determine how many cents are in a dollar. Knowing the number of cents in a dollar will allow me to reduce a big amount of the cents into dollars
            dollars = inputCents / 100; // 1134 / 100 = 11

            //4) after calculating the number of dollars I can make I will find the left over cents that couldn't fit into a dollar
            inputCents = inputCents % 100; // inputCents = inputCents % 100  | 1134 % 100 = 34

            //5) I will look at the next biggest currency type, which is quarters. I will see how many of my cents can fit into a quarter value
            quarters = inputCents / 25; // 34 / 25 = 1

            //6) after calculating the number of quarters I will remove that many cents from my total cents
            inputCents %= 25;       // 34 % 25 = 9

//        7) I will then repeat those steps for dimes and nickels to check how many of my cents can be represented as dimes and nickels

            dimes = inputCents / 10; // 9 / 10 = 0
            inputCents %= 10;       // 9 % 10 = 9

            nickles = inputCents / 5; // 9 / 5 = 1
            inputCents %= 5;            /// 9 % 5 = 4

            // 8) any left over cents will be my left over pennies
            pennies = inputCents;

            // only print the values if they are not 0

            String output = "";
            output += dollars > 0 ? "dollars = " + dollars : "";
            output += quarters > 0 ? "\nquarters = " + quarters : "";
            output += dimes > 0 ? "\ndimes = " + dimes : "";
            output += nickles > 0 ? "\nnickles = " + nickles : "";
            output += pennies > 0 ? "\npennies = " + pennies : "";

            System.out.println(output);

//            if(dollars > 0) {
//                System.out.println("dollars = " + dollars);
//            }

        /*
                    System.out.println("dollars = " + dollars);
        System.out.println("quarters = " + quarters);
        System.out.println("dimes = " + dollars);
        System.out.println("nickles = " + nickles);
        System.out.println("pennies = " + pennies);

         */

        } else {
            System.out.println("Sorry cannot calculate for negative numbers ");
        }

    }}

/*

Penny Machine [challenge] [variables, operators, conditional statements, Scanner]

Create a program that will allow the user to convert their cents(pennies) into dollars, quarters, dimes, & nickles. Note: I am trying to convert
my cents into the biggest types possible, like getting change back. Not how many of each I can make

Pseudocode guide:
    1) define the total number of cents, these are all pennies at the beginning
    2) define all the currency types I can use: dollars, quarters, dimes, nickels, and left over pennies
    3) I will start with the biggest type I can return, which is dollars. I will determine how many cents are in a dollar.
    Knowing the number of cents in a dollar will allow me to reduce a big amount of the cents into dollars
    4) after calculating the number of dollars I can make I will find the left over cents that couldn't fit into a dollar
    5) I will look at the next biggest currency type, which is quarters. I will see how many of my cents can fit into a quarter value
    6) after calculating the number of quarters I will remove that many cents from my total cents
    7) I will then repeat those steps for dimes and nickels to check how many of my cents can be represented as dimes and nickels
    8) any left over cents will be my left over pennies
    9) display all dollars, quarters, dimes, nickles and pennies I was able to get back from my initial cents amount

Bonus: make it dynamic with Scanner input. Check that cents are above 0
Bonus: only display the currency types that were needed. For example if I had 0 dimes then don't display it in the final result
 */


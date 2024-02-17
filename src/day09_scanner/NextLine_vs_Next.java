package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Enter

        System.out.println("Enter your age: ");
        int age = input.nextInt();//45\n=>45, then add input.nextLine()

        input.nextLine();

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("age = "+age);
        System.out.println("full_name " +full_name);



    }
}

/*
Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol
 */
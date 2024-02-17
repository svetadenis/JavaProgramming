package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();// Aaron King Daniel + enter

        System.out.println("Enter your school name");
        String school_name = input.nextLine();// cydeo school + enter

        System.out.println("Enter your gender: ");
        String gender = input.next();//male

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //28

        System.out.println("Enter your street name: ");
        String street = input.nextLine ();

        input.nextLine();//clear out the scanner
        //we have to give extra nextLine() method if we are using a nextLine() method after the other methods of scanner

















    }
}

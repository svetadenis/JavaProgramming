package day12_CustomMethodIntro;
import java.util.Scanner;
public class FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first_name = input.nextLine().trim().replace(" ","");//we use trim, because user can put blank space in a line
        System.out.println("Enter your last name: ");
        String last_name = input.nextLine().trim().replace(" ","");//we use

        input.close();
       /* String first_name = "cyDEo";
        String last_name = "SCHOOL";*/


        first_name = first_name.substring(0,1).toUpperCase() +first_name.substring(1).toLowerCase();
        //getting first character of first name+the remaining characters of the first name
        System.out.println(first_name);
        last_name=last_name.substring(0,1).toUpperCase()+last_name.substring(1).toLowerCase();
        System.out.println(last_name);
        String full_name = first_name + " " +last_name;
        System.out.println(full_name);
    }
}
/*
   Write a program that asks user to enter first and last names,
   and then prints the full name in regular format (first character in upper case)
    input:
    firstName = "cyDEo"
    lastName = "SCHOOL";

    output:
    Cydeo School
 */
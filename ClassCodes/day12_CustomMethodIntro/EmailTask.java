package day12_CustomMethodIntro;

public class EmailTask {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";
        String firstName = email.substring(0, email.indexOf("_"));
        System.out.println(firstName);//mike
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        System.out.println(lastName);//tyson
        String rest = email.substring(email.indexOf("@"));
        System.out.println(rest);//gmail.com
        email=lastName + firstName+rest;
        System.out.println(email);




    }
}

/*
 Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */
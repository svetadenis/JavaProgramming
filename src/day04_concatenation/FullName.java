package day04_concatenation;

public class FullName {
    /*
1. Create a class named FullName.java
2. Declare the follow in variables:
1. firstName 2. lastName
3. Use concatenation to print the full name
Ex:Your full name is Daniel Jefferson
     */
    public static void main(String[] args) {
        String firstName = "Daniel";
        String lastName = "Jefferson";

    String fullName = firstName + " " +lastName;
        System.out.println("Your full name is " + fullName);

    }
}

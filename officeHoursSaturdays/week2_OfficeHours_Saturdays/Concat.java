package week2_OfficeHours_Saturdays;


public class Concat {
    public static void main(String[] args) {

        char first = 'S';
        char second = 'a';
        char third = 'i';
        char fourth = 'm';
        System.out.println(first + second + third + fourth); // this will add all the ascii values of the characters
        System.out.println("My name is " + first + second + third + fourth);
        System.out.println(first + second + third + fourth + " is my name");
        System.out.println("" + first + second + third + fourth + " is my name");

        System.out.println(1 + "" + 2); // empty space doesn't have a value, but it is String
        System.out.println(1 + " " + 2); //space is a character

    }
}
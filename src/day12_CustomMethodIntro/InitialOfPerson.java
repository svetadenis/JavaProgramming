package day12_CustomMethodIntro;

public class InitialOfPerson {
    public static void main(String[] args) {
        maxNum(10000, 5000);
    }

    //create a method that can print the maximum number between two numbers,if both are equal then
    //it prints "Equal,(num1,num2)
    public static void maxNum(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("Equal");
        }
//_____________________________________________________________________________
        //Create a method that can display the initials of a person
 /* first name = "Cydeo";
 last name = "School";

 initial ==>C.S
  */
        initial("Cydeo","School");
        initial("Svetlana","Denisenko");
    }

    public static void initial(String firstName, String lastName){

    String initial = firstName.charAt(0) + "."+ lastName.charAt(0);

    System.out.println("initial is: " +initial);

}}
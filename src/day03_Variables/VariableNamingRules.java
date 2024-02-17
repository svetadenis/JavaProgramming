package day03_Variables;

public class VariableNamingRules {
    /*
    1. Readable, understandable, and meaningful;
    2. must be unique
    3. camel case (see below)
    4.can not have special characters, other than _ and $
    5. can not starts with the digits
    6. can not be java reserved world

     */
    public static void main(String[] args) {
        //age of the student is 28
        //salary is 10000
        int age = 28;
        int salary = 10000;

       // int age = 32;wrong, because variable name must be unique (we already have name "age" in a string 11
        int phoneNumber = 123456789;// camel case
        double salaryBeforeTax = 100000.5;

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        //double abstract = 5.5;// variables name can't bee java reserved words
        //double final = 85.5;

        System.out.println("___________________________________________________");

        //gender is male
        String gender = "Male";
        String fullName = "Cydeo School";
        System.out.println(gender);
        System.out.println(fullName);













    }
}

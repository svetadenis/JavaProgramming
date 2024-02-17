package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

int number = 100;
boolean isPositive = number>0;//if the number is greater than 0, then it's a positive number
boolean isNegative = number < 0;//if the number is less than 0, then it's a positive number
//boolean isZero = number ==0;//if the number is equal to zero, then it's 0

 boolean isZero = !isPositive || !isNegative;//if the number is NOT negative AND NOT positive, that it's 0

        System.out.println(number +" is positive number: " +isPositive);
        System.out.println(number +" is negative number: " +isNegative);
        System.out.println(number + " is zero: " +isZero);

    }
}


/*
Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false

 */
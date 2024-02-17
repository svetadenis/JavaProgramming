package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {

        int number = 20;

        boolean isEven = number % 2 == 0;
        boolean isOdd = number % 2 != 0;

        if (isEven) {
            System.out.println("Even number");
        }
        if (isOdd) {
            System.out.println("Odd number");
        }
        System.out.println("_________________________________________");

        if (number % 2 == 0) {
            System.out.println("Even number");
        }
        if (number % 2 != 0) {
            System.out.println("Odd number");
        }
    }
}
/*
  int number = 20;
        boolean isEven = number % 2 ==0;// when we divide a number by 2, if the reminder is 0, means the number is even
    //    boolean isOdd = number % 2 != 0;// when we divide a number by 2, if the reminder in NOT 0, means the number is odd

        boolean isOdd = !isEven;//if the number is not even, then it's odd
        System.out.println(number + " is an even number: " +isEven);
        System.out.println(number + " is an odd number: " +isOdd); } }
/*
Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20
			output:
				20 is an even number: true
				20 is an odd number: false
		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)

 */


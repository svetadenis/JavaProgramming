package week6_OfficeHours_Saturday;

public class MultiplicationTable2 {

    // original version
//    public static void printMultiplicationTableFor(int num){
//        for(int i = 1; i <= 10; i++){
//            System.out.println(num + " x " + i + " = " + (num * i));
//        }
//    }
//
    // but after overloading we can update it
    public static void printMultiplicationTableFor(int num){
        printMultiplicationTableFor(num, 10);
    }

    public static void printMultiplicationTableFor(int num, int endPoint){
        for(int i = 1; i <= endPoint; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

}

/*

Multiplication Table [methods, loops, operators]

	create a method that will accept a number. Print the multiplication table for the give number up until 10

	print the results in this format:
		$number x 1 = result
		$number x 2 = result
		...
		$number x 10 = result

		ex:
			number = 4
			4 x 1 = 4
			4 x 2 = 8
			...

 */

/*
Multiplication Table II [methods, overloading, loops, operators]

	overload the previous multiplication table method to accept the number for the table and also the ending point for the multiplication(the default was before was 10)

		ex: inputs: 3, 20
			result would print the multiplication table of 3 up until 20
				3 x 1 = 3
				...
				3 x 20 = 60
 */


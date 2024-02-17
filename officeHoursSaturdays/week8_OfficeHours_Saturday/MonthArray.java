package week8_OfficeHours_Saturday;

import java.util.Arrays;
public class MonthArray {
    public static void main(String[] args) {

        String[] months =  {"January","February","March","April","May","June","July","August","September","October","November","December"};

        // print the whole array
        System.out.println(Arrays.toString(months));

        int monthNum = 1; // this could be scanner method --> the user would enter a number from 1 - 12

        System.out.println(months[monthNum - 1]); // we do -1 to convert the month number to an index
        // we don't need Arrays.toString because we are printing a String, just one of the elements

    }
}

/*
Months [array]

	Create a program that will define an array with all the months in order. Use this array to help print the full name of a month by giving a number

	Ex:
		input: 1
		output: January

		input: 11
		output: November

	Other variations of this task we have done before: word to number, number to word

 */


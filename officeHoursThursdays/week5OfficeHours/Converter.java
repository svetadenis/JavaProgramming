package week5OfficeHours;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        // assume the user only enters valid numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the converter. Pick a number from the following options for your conversion\n1. inches to centimeters\n2. pounds to kilograms\n3. fahrenheit to celsius\n4. feet to meters\n5. feet to inches\n6. gallons to liters");
        int selection = input.nextInt();
        System.out.println("What is the base number");
        double baseNum = input.nextDouble();
        input.close();

        double convertedNum = 0;
        String convertedUnit = "";

        switch (selection) {
            case 1:
                convertedNum = baseNum * 2.54;
                convertedUnit = "centimeters";
                break;
            case 2:
                convertedNum = baseNum * 0.454;
                convertedUnit = "kilograms";
                break;
            case 3:
                convertedNum = (baseNum  - 32) / 1.8;
                convertedUnit = "celsius";
                break;
            case 4:
                convertedNum = baseNum * 0.3048;
                convertedUnit = "meters";
                break;
            case 5:
                convertedNum = baseNum * 12;
                convertedUnit = "inches";
                break;
            case 6:
                convertedNum = baseNum * 3.785;
                convertedUnit = "liters";
                break;
        }

        System.out.println(convertedNum + " " + convertedUnit);

    }
}

/*
T5Converter [switch, Scanner, variables, operators]

	create a program that can help the user convert between different unit types. Create a menu that will show the options by numbers (ie 1. inches to centimeters), so if the user picks 1 it will be converting from inches to centimeters. After asking for the conversion operation ask the user the value for the base number (in this example inches)

	sample menu:
		1. inches to centimeters		[formula: inches * 2.54]
		2. pounds to kilograms			[formula: pounds * 0.454]
		3. fahrenheit to celsius		[formula: (fahrenheit - 32) / 1.8]
		4. feet to meters			    [formula: feet * 0.3048]
		5. feet to inches				[formula: feet * 12]
		6. gallons to liters			[formula: gallon * 3.785]
 */
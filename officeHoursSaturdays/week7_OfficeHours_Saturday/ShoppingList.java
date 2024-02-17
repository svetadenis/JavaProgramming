package week7_OfficeHours_Saturday;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String shoppingList = "";
        boolean keepRunning = true;

        do {
            System.out.println("Please enter the item");
            String item = input.nextLine();
            shoppingList += "* " + item + "\n";
            //shoppingList += "* " + input.nextLine() + "\n"; // this is the same as above 2 lines, but without a variable

            System.out.println("any other items to add? yes or no");
            String response = input.nextLine();
            keepRunning = response.equalsIgnoreCase("yes");
            //keepRunning = input.nextLine().equalsIgnoreCase("yes");

            if(!keepRunning && !response.equals("no")){ // the users something that was not yes or no
                // retry for yes or no
                System.out.println("Only enter yes or no");
                response = input.nextLine();
                keepRunning = response.equalsIgnoreCase("yes");
            }

        } while(keepRunning);

        System.out.println(shoppingList);

        input.close();
    }
}
/*
Shopping List [do while, String]

	create a program that create a shopping list for the user. The program will ask the user to enter the items one by one.

	the flow:
		ask the user for the item
		add item to the shopping list
		ask user if they want to add more items

	when the user is done creating the list print it
 */


package week4_OfficeHours_Saturdays;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner vending = new Scanner(System.in);
        System.out.println("Hello. Would you like drinks, snacks, tech");
        String mainOption = vending.next(); // Drinks

        double price = 0;

        switch (mainOption) {
            case "DRINKS":
            case "Drinks":
            case "drinks":
                System.out.println("1)Water\n2)Coffee\n3)Soda\n4)Energy Drink");
                int drinkOption = vending.nextInt();
                // using multibranch if inside of case
                if (drinkOption == 1) {
                    price = 2.99;
                } else if (drinkOption == 2) {
                    price = 3.55;
                } else if (drinkOption == 3) {
                    price = 1.99;
                } else if (drinkOption == 4) {
                    price = 4.00;
                }

                break;
            case "snack":
                System.out.println("1)chips\n2)cookies\n3)carrots");
                int snackOption = vending.nextInt();
                // using switch inside of case

                switch (snackOption) {
                    case 1:
                        price = 1.45;
                        break;
                    case 2:
                        price = 3.20;
                        break;
                    case 3:
                        price = 0.50;
                        break;
                }
                break;
            case "tech":
                System.out.println("1)laptop\n2)headphones");
                int techOption = vending.nextInt();
                // using ternary inside of case
                price = techOption == 1 ? 2000 : techOption == 2 ? 150 : 0;
        }

        vending.close();

        if (price != 0) {
            System.out.println(price);
        } else {
            System.out.println("Sorry function could not work. please try again");
        }

    }
}
/*
Vending Machine [Scanner, conditional statements]

	Define a program that will act like a vending machine. This task will not have many details. I want you to try writing some code with this idea in mind
	Flow:
		ask if they want the drink options or snack options
			if they select the drink option show the menu of water, coffee, soda, energy drink
			if they select the snack option show the menu of chips, cookies, carrots
		based in their selection display the price of the item
 */


/*

    version with boolean isValid

public class VendingMachine {
    public static void main(String[] args) {

        Scanner vending = new Scanner(System.in);
        System.out.println("Hello. Would you like drinks or snacks");
        String mainOption = vending.next(); // Drinks

        double price = 0;
        String menu = "";
        boolean isValid = true;

        switch (mainOption) {
            default:
                isValid = false;
                break;
            case "DRINKS":
            case "Drinks":
            case "drinks":
                menu = "1)Water\n2)Coffee\n3)Soda\n4)Energy Drink";
                System.out.println(menu);
                int drinkOption = vending.nextInt();
                // using multibranch if inside of case
                if (drinkOption == 1) {
                    price = 2.99;
                } else if (drinkOption == 2) {
                    price = 3.55;
                } else if (drinkOption == 3) {
                    price = 1.99;
                } else if (drinkOption == 4) {
                    price = 4.00;
                } else {
                    isValid = false;
                }

                break;
            case "snack":
                menu = "1)chips\n2)cookies\n3)carrots";
                System.out.println(menu);
                int snackOption = vending.nextInt();
                // using switch inside of case

                switch (snackOption) {
                    case 1:
                        price = 1.45;
                        break;
                    case 2:
                        price = 3.20;
                        break;
                    case 3:
                        price = 0.50;
                        break;
                    default:
                        isValid = false;
                }
                break;

            case "tech":
                menu = "1)laptop\n2)headphones";
                System.out.println(menu);
                int techOption = vending.nextInt();
                // using ternary inside of case

                price = techOption == 1 ? 2000 : techOption == 2 ? 150 : 0;

                if (price == 0) {
                    isValid = false;
                }

        }

        vending.close();

        if (isValid) {
            System.out.println(price);
        } else {
            System.out.println("Sorry function could not work. please try again");
        }

    }
}
 */
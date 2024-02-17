package week5OfficeHours;

import java.util.Scanner;

public class Habitat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the habitat you would like information about");
        String habitat = input.next();
        input.close();

        //String habitat = "jungle";   instead of using the 4 lines above you can hardcode that variable like this
        String animals = "";

        switch (habitat){
            case "grasslands":
                animals = "goats, bison, badgers, coyotes";
                break;
            case "jungle":
                animals = "snakes, tigers, gorillas, rhinos, toucans";
                break;
            case "city":
                animals = "dogs, cats, gulls, squirrels";
                break;
            case "safari":
                animals = "lion, hippo, giraffe, zebras, elephants";
                break;
            default:
                animals = "invalid habitat. no information available";
        }

        System.out.println("In the " + habitat + " you will be able to find: " + animals);
    }
}

/*
T3Habitat [switch, variables, Scanner]

	create a program that will ask the user about a habitat and print the information about the animals that can be found in that habitat

	use the following data and make creative messages for the outputs
		habitat - animals
		grasslands - goats, bison, badgers, coyotes
		jungle	- snakes, tigers, gorillas, rhinos, toucans
		city	- dogs, cats, gulls, squirrels
		safari - lion, hippo, giraffe, zebras, elephants

		anything else - invalid habitat. no information available

		Ex:
			input:
				jungle
			output:
				In the jungle you will be able to find: snakes, tigers, gorillas, rhinos, toucans
 */
package extraChallenge;

import java.util.Random;
import java.util.Scanner;

//make a program to roll a 6 sided dice
public class Dice {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean rollAgain;

        do{
            System.out.println("Rolling dice.....");
            System.out.println("\t" + (random.nextInt(6) + 1));
            System.out.println("Roll again? y or n");
            String rollInput = input.next();
            rollAgain = rollInput.equalsIgnoreCase("y") || rollInput.equalsIgnoreCase("yes");
        } while (rollAgain);

        input.close();

    }
}
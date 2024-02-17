package extraChallenge;

import java.util.Random;
import java.util.Scanner;

//  make a number guess program. The program will have a new random number that the user must guess. They will keep guessing until they get it right. Use messages like "too high", or "too low" to help the user.
public class GuessNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int secretNumber = random.nextInt(100) + 1;
        boolean keepGuessing = true;
        int attempts = 1;

        do {
            System.out.println("Guess a number from 1 - 100");
            int guess = input.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println(guess + " is too high");
            } else if (guess < secretNumber) {
                System.out.println(guess + " is too low");
            } else {
                keepGuessing = false;
            }

        } while (keepGuessing);

        input.close();

        System.out.println("You guessed right! it was: " + secretNumber);
        System.out.println("It took you " + attempts + " guesses");

    }
}
package week6_OfficeHours_Saturday;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        int interacted = 0;
        String log = "";
        System.out.println("BOOTING UP....");

        while(isRunning){
            String userInput = input.nextLine().trim().toLowerCase();
            interacted++;
            String response;
            switch (userInput){
                case "hello":
                case "hi":
                    response = "World";
                    break;
                case "age":
                case "what is your age":
                    response = "I was programmed in 2023";
                    break;
                case "who created you":
                    response = "Saim";
                    break;
                case "what can we talk about":
                case "menu":
                    response = "Commands I recognize: hello, what is your age, who created you, what can we talk about, hi, age, menu, off";
                    break;
                case "off":
                    response = "haha you cannot turn me off I am invincible";
                    break;
                case "shutdown":
                    response = "SHUTTING DOWN....";
                    isRunning = false; // the loop is infinite, until this statement runs. When the boolean is changed to the false and the loop checks the boolean again, then the loop will stop
                    break;
                default:
                    response = "Sorry not a valid command";
            }
            System.out.println("> " + response);
            log += "User: " + userInput + "\nBot: " + response +"\n";
        }

        input.close();

        System.out.println("Interacted " + interacted);
        System.out.println("LOG: " + log);

    }
}
/*
Bot [while, Scanner, conditional]

	create a program that will make a simple bot that can talk with the user. when the program runs the user will be able to continue typing to the bot. Based on what the user says the bot will say something back. Use the following sample set up, but be creative and add more to the bot

	user says | > bot responds

	hello | > world
	what is your age | > I was programmed in 2023
	who created you | > I was created by Saim (use your name)
	what can we talk about | > print a menu of the options the bot can respond to

	off | > haha you cannot turn me off I am invincible
	shutdown | > SHUTTING DOWN (program ends, user cannot type anymore)

	bonus: keep track how many times you interacted with the bot
	bonus: keep a log of the conversation
 */

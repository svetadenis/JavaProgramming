package week6_OfficeHours_Saturday;

import java.util.Scanner;

public class Bot2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        System.out.println("BOOTING UP....");
        while(true){
            String userInput = input.nextLine().trim().toLowerCase();
            String response = botResponses(userInput);
            System.out.println("> " + response);

            if(response.equals("SHUTTING DOWN...")){
                break;
            }
        }

//        while(isRunning){
//            String userInput = input.nextLine().trim().toLowerCase();
//            String response = botResponses(userInput);
//            System.out.println("> " + response);
//
//            isRunning = !response.equals("SHUTTING DOWN...");
//        }

        input.close();

    }

    public static String botResponses(String command){
        String response;
        switch (command){
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
                response = "SHUTTING DOWN...";
                break;
            default:
                response = "Sorry not a valid command";
        }
        return response;
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
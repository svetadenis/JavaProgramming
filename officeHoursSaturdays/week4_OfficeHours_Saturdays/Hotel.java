package week4_OfficeHours_Saturdays;


    import java.util.Scanner;

    public class Hotel {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the java hotel\nHow many days will you stay?");
            int numberOfDays = input.nextInt();
            System.out.println("How many people in your party?");
            int numberOfPeople = input.nextInt();
            input.close();

            int price = 0;
            String roomType = "";
            boolean isValid = true;

            switch (numberOfPeople){
                case 1:         // if(numberOfPeople == 1)
                    roomType = "Single Room";
                    price = numberOfDays * 100;
                    break;
                case 2:
                    roomType = "Double Room";
                    price = numberOfDays * 125;
                    break;
                case 3:             // if(numberOfPeople == 3 || numberOfPeople == 4)
                case 4:
                    roomType = "Large Room";
                    price = numberOfDays * numberOfPeople * 50;
                    break;
                case 5:
                case 6:
                    roomType = "Suite";
                    price = numberOfDays * 1000;
                    break;
                default:
                    isValid = false;
            }

            // prints a message based on valid data
            if(isValid){
                System.out.println("Room you are assigned is " + roomType + " for " + numberOfDays + " days and " + numberOfPeople + " people it will cost $" + price);
            } else {
                System.out.println(numberOfPeople + " is not a valid group size");
            }

            // same as above, but only one print method
            String result;
            if(isValid){
                result = "Room you are assigned is " + roomType + " for " + numberOfDays + " days and " + numberOfPeople + " people it will cost $" + price;
            } else {
                result = numberOfPeople + " is not a valid group size";
            }
            System.out.println(result);

            // as ternary
            System.out.println(isValid ? "Room you are assigned is " + roomType + " for " + numberOfDays + " days and " + numberOfPeople + " people it will cost $" + price : numberOfPeople + " is not a valid group size");


        }

    }
/*
Hotel [scanner, conditional, operators]

	Create a program that will allow you to check into a hotel. When checking in some information will be gathered and used to determine the information about the room and price

	Go through the following flow:

		Welcome to the Java Hotel
		How many days will you stay
		-> read number of days from console
		How many people are in your party
		-> read number of people from console

	In addition declare these variables:
		price, room type

	Use the information gathered to assign a room to the guests and print the information

	Data:

		people 1 | single room | price: number of days staying * 100
		people 2 | double room | price: number of days staying * 125
		people 3 or 4 | large room | price: number of days staying * number of people * 50
		people 5 or 6 | suite | price: number of days staying * 1000

		any other number of people is invalid and should output:
			sorry $number_of_people is not a valid group size
 */


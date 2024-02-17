package week2_OfficeHours_Saturdays;
public class Computer {

public static void main(String[] args) {

        // declare all the variables;
        String brand, processor;
        int ram, storage, numberOfUsbSlots;
        double price;
        boolean hasBluetooth, hasWifiCard;

        brand = "HP";
        processor = "I9";
        ram = 16;
        storage = 1000;
        numberOfUsbSlots = 3;
        price = 2_000.99; // underscore is to make the number readable <- this is for the editor
        hasBluetooth = false;
        hasWifiCard = true;

        System.out.println("brand = " + brand);
        System.out.println("processor = " + processor);
        System.out.println("ram = " + ram);
        System.out.println("storage = " + storage);
        System.out.println("numberOfUsbSlots = " + numberOfUsbSlots);
        System.out.println("price = " + price);
        System.out.println("hasBluetooth = " + hasBluetooth);
        System.out.println("hasWifiCard = " + hasWifiCard);

        }
        }
/*

Computer [variables, datatypes, printing]

	create a class Computer
	create a main method

	declare these variables with an a datatype that matches it:
		brand, processor, ram, storage, price, number of usb slots, has bluetooth, has wifi card

	assign some value to all the variables

	print all the variables
 */
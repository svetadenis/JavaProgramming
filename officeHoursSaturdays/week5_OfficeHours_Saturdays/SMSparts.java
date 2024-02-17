package week5_OfficeHours_Saturdays;

public class SMSparts {
    public static void main(String[] args) {

        String data = "Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}";
        int senderStart = data.indexOf('<') + 1; // moves the character to be the first char of the name
        int senderEnd = data.indexOf('>');
        String sender = data.substring(senderStart, senderEnd);

        int numberStart = data.indexOf('[');
        int numberEnd = data.indexOf(']');
        String number = data.substring(numberStart + 1, numberEnd);

        String message = data.substring(data.indexOf('{') + 1, data.indexOf('}'));

        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);

    }
}

/*
SmsParts [substring, indexOf]

	Create a program that will has a message String in this exact format:

		Sender: <NAME>. From number: [NUMBER]. Message: {MESSAGE}

	The content of name, number and message can vary, so based on the format extract those parts and output them.

	Ex:
	Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}

	Output:
		Sender: Omer Karahan
		Number: 202-123-3456
		Message: I love programming and problem solving
 */


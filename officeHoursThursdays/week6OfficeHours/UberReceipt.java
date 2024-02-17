package week6OfficeHours;

public class UberReceipt {
    public static void main(String[] args) {
        String receipt = "Uber Receipts 2 days ago\n" +
                "Thanks for using Uber. Remember to rate your driver\n" +
                "The *10* mile trip took about |35| minutes\n" +
                "Your total was $25.19";

      //  int indexOfStar = receipt.indexOf('*');
       // int lastIndexOfStar = receipt.lastIndexOf('*');
       // System.out.println("Miles: " + receipt.substring(indexOfStar + 1, lastIndexOfStar));
        System.out.println("Miles: " + receipt.substring(receipt.indexOf('*') + 1, receipt.lastIndexOf('*')));
        System.out.println("Minutes: " + receipt.substring(receipt.indexOf('|') + 1, receipt.lastIndexOf('|')));
        System.out.println("Price:" + receipt.substring(receipt.indexOf('$')));

    }
}
/*
T3UberReceipt [String, indexes]

    create a program that will extract details from a receipt emailed for your uber ride
    extract the number of miles, number of minutes, and total cost

    here is an example receipt:

        String receipt = "Uber Receipts 2 days ago\n" +
                "Thanks for using Uber. Remember to rate your driver\n" +
                "The *5* mile trip took about |20| minutes\n" +
                "Your total was $25.19";
 */


package week5OfficeHours;

public class Parking {
    public static void main(String[] args) {

        int time = 100;
        double fee = (time >= 6 && time <= 12) ? 7.50 : (time >= 13 && time <= 23) || (time >= 0 && time <= 5) ? 15 : -1;

        System.out.println(fee);

        System.out.println("====== alternative solution + extra ======");
        boolean timeIsValid = time >= 0 && time <= 23;

        if(timeIsValid){
            System.out.println( (time >= 6 && time <= 12) ? 7.50 : 15 );
        } else {
            System.out.println(time + " is not a valid time. it should be between 0 - 23 in 24 HR format");
        }


    }
}
/*
T1Parking [ternary]

	create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city

		If the time is between 6-12:
			fee: 7.50

		if the time is between 13 - 23 or 0 - 5
			fee is 15

		extra: if the time is outside of the valid range (0-24) then output an error message
 */


package week10_OfficeHours_Saturdays;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PracticeDateTime {
    public static void main(String[] args) {

        //get the current day and find out what the date will be in 130 days
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate daysAfter = today.plusDays(130);
        System.out.println(daysAfter);
        System.out.println(daysAfter.getDayOfWeek());
        System.out.println(daysAfter.getDayOfYear());

        //ask the users to enter their birthday and calculate what day of the week their next birthday will be on
//        Scanner input = new Scanner(System.in);
//        String[] questions = {"year", "month", "day"};
//        int[] birthdayValues = new int[3];
//
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println("Enter your birth " + questions[i]);
//            birthdayValues[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(birthdayValues));
//        LocalDate birthdayObj = LocalDate.of(birthdayValues[0], birthdayValues[1], birthdayValues[2]);
//        System.out.println(birthdayObj);
//
//        LocalDate next = LocalDate.of(today.getYear(), birthdayObj.getMonth(), birthdayObj.getDayOfMonth()); // we need to get the birthday date for this year, so we read the current year and used the month and day values from our birthday
//        if(birthdayObj.getDayOfYear() < today.getDayOfYear()){ // if the birthday already happened this year, we need to find the next years birthday
//            next = next.plusYears(1);
//        }
//
//        System.out.println(next);
//        System.out.println(next.getDayOfWeek());

        /*  this is how you would have done the line 23-26
        System.out.println("Enter your birth year");
        int year = input.nextInt();
        System.out.println("Enter your birth month");
        int month = input.nextInt();
        System.out.println("Enter your birth day");
        int day = input.nextInt();
           */

        //- define the times a store is open and check if you can visit the store at your current time

        LocalTime storeCloseTime = LocalTime.of(18, 0);
        System.out.println(storeCloseTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(storeCloseTime.format(formatter));

        if(LocalTime.now().isBefore(storeCloseTime)){
            System.out.println("Open to visit");
        } else {
            System.out.println("Sorry, we are closed");
        }

    }
}
/*
Date Time Tasks [LocalDate, DateTimeFormatter]

    - get the current day and find out what the date will be in 130 days
    - ask the users to enter their birthday and calculate what day of the week their next birthday will be on
    - define the times a store is open and check if you can visit the store at your current time

 */
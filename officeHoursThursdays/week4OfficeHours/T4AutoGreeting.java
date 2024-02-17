package week4OfficeHours;

public class T4AutoGreeting {
    public static void main(String[] args) {
        int hour = 3;
        boolean isAM = false; // am = true, pm = false

        if(hour >= 6 && hour <= 11 && isAM){
            System.out.println("Good Morning");
        } else if(!isAM && (hour >= 1 && hour <= 5 || hour == 12)){ // am || time
            System.out.println("Good Evening");
        } else { // when we use else here, we are assuming the times are only between 1-12
            System.out.println("Good Night");
        }

        // should work the same as line 11
        //else if((hour == 12 || (hour >= 1 && hour <= 5)) && !isAM){

        //off topic Q: how to write the statement for 9am to 2pm
//        boolean b1 = isAM && (hour >= 9 && hour <= 11);
//        boolean b2 = !isAM && (hour == 12 || hour == 1 || hour == 2);
//        if(b1 || b2)

    } // come back 1:06 est
}
/*
T4AutoGreeting [multibranch, operators]

    create a program that will define an hour variable and a boolean for am or pm (am = true, pm = false)
    using the given values to determine what message should be output:
    if the hours are from 6 am - 11 am, print: Good morning
    if the hours are from 12 pm - 5 pm, print: Good evening
    if the hours are from 6 pm - 11 pm or 12 am - 5 am print: Good night
 */

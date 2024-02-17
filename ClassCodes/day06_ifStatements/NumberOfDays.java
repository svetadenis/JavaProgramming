package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int n = 1;

        boolean has28Days = (n == 2);//if the month is 2 (Feb), then it has to be 28 days
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
        boolean has31Days = n == 1 || n == 3 || n == 5 || n == 7 || n == 9;
        //if the month doesn't have 28 days and also does not have 30 days,then the month has 31 days
        /*if(has28Days){
            System.out.println("28 days");}
        if(has30Days){
            System.out.println("30 days");}
        if(has31Days){
            System.out.println("31 days");
        }*/

        String result = "";

        if (has28Days) {
            result = "28 days";
        }
        if (has30Days) {
            result = "30 days";
        }
        if (has31Days) {
            result = "31 days";
        }
        System.out.println(result);

    }
}


/*
An integer variable named month is declared and given, write a program
that can print the number of days in the given month
Ex:
Given: number = 1
Output: 31 days

Hits: Months that has 31 days are: 1,3,5,7,8,10,12
      Months that has 30 days are: 4,6,9,11
      Month that has 28 days:2
 */
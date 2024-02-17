package day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {
//we didn't use curly bracers. Do not do it anymore. it's just for practice
        int n = 14;
        String month = "";
        if (n >= 1 && n <= 12){ //12 possible numbers

            if (n == 1) month = "January";
            else if (n == 2) month = "February";
            else if (n == 3) month = "March";
            else if (n == 4) month = "April";
            else if (n == 5) month = "May";
            else if (n == 6) month = "June";
            else if (n == 7) month = "July";
            else if (n == 8) month = "August";
            else if (n == 9) month = "September";
            else if (n == 10) month = "October";
            else if (n == 11) month = "November";
            else if (n == 12) month = "December";

    }else {
            month = "No such a month";
        }
        System.out.println("month is " +month);


    }
}



/* An integer variable named number is declared and given, write a program that can print
the name of the month that the number represents
Ex:
Given: number = 10
Output: October
 */
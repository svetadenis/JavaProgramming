package day08_ternary_switch;

import org.w3c.dom.ls.LSOutput;

public class TernaryDayOfTheWeek {
    public static void main(String[] args) {

        int n = 5;
        String day = (n>=1 && n<=7)?
                (n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday"
                :(n==5)?"Friday":(n==6)?"Saturday":"Sunday"
        :"No such a day";
        System.out.println(day);
//? and : MUST be even in Ternary
   /*
    int day = 1;
     String result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday"
            : (day == 4) ? "Thursday" : (day == 5) ? "Friday"
            : (day == 6) ? "Saturday" : "Sunday";
    System.out.println(day);
    */

}}

          /*  int day = 1;
            String result = "";

            if (day == 1){ result = "Monday";
            }
            if (day == 2){ result = "Tuesday";
            }
            if (day == 3){ result = "Wednesday";
            }
            if (day == 4){ result = "Thursday";
            }
            if (day == 5){ result = "Friday";
            }
            if (day == 6){ result = "Saturday";
            }
            if (day == 7){ result = "Sunday";
            }
            System.out.println(result);
        } }
An integer variable named number is declared and given, write a program that can print the name of the day that the number represents
 Ex:
 Given: number 1
 output: Monday
 Hint: Assume that a number between 1-7 is given to the variable
 */
package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);//2023-12-13

        LocalDate birthday = LocalDate.of(2000,5,26);
        System.out.println(birthday);//2000-05-26

    System.out.println("_________________________________________________");

        System.out.println(today.getYear());//2023

        System.out.println(today.getMonth());//december

        System.out.println(today.getMonthValue());//12

        System.out.println(today.getDayOfWeek());//wednesday
        System.out.println(birthday.getDayOfWeek());//friday

        System.out.println(today.getDayOfMonth());//13

        System.out.println(today.getDayOfYear());//347
        System.out.println("___________________________________________");

       today= today.plusYears(1);
        System.out.println(today);//2024-12-13

        System.out.println("______________________________________________");

        LocalDate graduationDate = LocalDate.of(2025,6,4);
         graduationDate =  graduationDate.plusYears(2);
        System.out.println(graduationDate);//2027-06-04
        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate);//2028-01-04

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate);//2028-02-22

        graduationDate =graduationDate.plusDays(100);
        System.out.println(graduationDate);//2028-06-01

        LocalDate yourBirthday = LocalDate.of(2005,4,1);
       yourBirthday =  yourBirthday.minusYears(2).minusMonths(3);
        System.out.println(yourBirthday);//2003-01-01

        System.out.println("______________________________________________");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);

        boolean r1 =  birthday1.isEqual(birthday2);
        System.out.println(r1);//false

        System.out.println("________________________________________________");

        LocalDate grad_date = LocalDate.of(2023,1,1);
        System.out.println(grad_date.isBefore(LocalDate.of(2023,1,2)));//true

        System.out.println("___________________________________________________");

        System.out.println(LocalDate.of(2022,6,16).isLeapYear());//false
        //The isLeap() method of the Year class returns true if the year is a leap year and false otherwise.
        //высокосный год









    }
}

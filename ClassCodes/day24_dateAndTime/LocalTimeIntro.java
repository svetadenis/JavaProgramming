package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

    LocalTime starting_time = LocalTime.of(10,30);
    System.out.println(starting_time);//10:30

    LocalTime right_now = LocalTime.now();
    System.out.println(right_now);//22:31:02.854981

    System.out.println("_________________________________________________________");

  //  LocalTime time1 = LocalTime.of(26,61);
  //  System.out.println(time1);//error.The max hours is supposed to be no more then 23, and minutes is 59

    LocalTime time1 = LocalTime.of(23,59,45);
    System.out.println(time1);//23:59:45
   time1 = time1.plusHours(1);
    System.out.println(time1);//00:59:45
    System.out.println("_______________________________________________________");



    }
}

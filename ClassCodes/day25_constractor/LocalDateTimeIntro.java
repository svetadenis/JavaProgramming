package day25_constractor;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);//2023-12-17T11:44:27.683250

        LocalDateTime ends=LocalDateTime.of(2023,5,18,11,0);
        System.out.println(ends);//2023-05-18T11:00
        System.out.println(starts.getDayOfWeek());//SUNDAY
        System.out.println(starts.getHour());//12



    }}


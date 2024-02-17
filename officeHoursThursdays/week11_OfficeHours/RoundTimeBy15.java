package week11_OfficeHours;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RoundTimeBy15 {
    public static void main(String[] args) {

        LocalTime startTime = LocalTime.of(5, 55); // 1:13
        System.out.println(startTime.format(DateTimeFormatter.ofPattern("h:mm a")));
        int hour = startTime.getHour();
        int minutes = startTime.getMinute();
        System.out.println(hour);
        System.out.println(minutes);

        int reminder = minutes % 15;
        System.out.println(reminder);

        int roundedMinutes = minutes + (reminder < 8 ? -reminder: (15 - reminder)); // determine which way to round

        if(roundedMinutes == 60){
            hour++;
            roundedMinutes = 0;
        }

        System.out.println(hour + ":" + roundedMinutes);

        System.out.println("-----------------------------");

        LocalTime time2 = LocalTime.of(13, 55);
        int reminder2 = time2.getMinute() % 15;
        time2 = time2.plusMinutes(reminder2 < 8 ? -reminder2: (15 - reminder2));
        System.out.println(time2.format(DateTimeFormatter.ofPattern("h:mm a")));

    }
}
/*
Round Time by 15 [LocalTime]

    create a program that will round the current time to the nearest 15 minute interval
    hint: 8 minutes is the middle and rounds up
    ex:
        1:13 -> rounds to 1:15
        1:07 -> rounds to 1:00
        1:08 -> rounds to 1:15
        1:55 -> rounds to 2:00
        1:35 -> rounds to 1:30
 */
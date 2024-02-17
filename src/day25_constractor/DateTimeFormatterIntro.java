package day25_constractor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);//2023-12-17

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y");
        System.out.println(today.format(df));//2023

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yy");
        System.out.println(today.format(df1));//23

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("y/MMM/dd");
        System.out.println(today.format(df2));//2023/Dec/17

        LocalDate date1 = LocalDate.of(2022,7,1);
        System.out.println(date1.format(df));//2022

        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd-MM-y");
        System.out.println(today.format(df3));//17-12-2023

        DateTimeFormatter df5 = DateTimeFormatter.ofPattern("EEEE,MM/dd/y");
        System.out.println(today.format(df5));//Sunday,12/17/2023

        System.out.println("_________________________________________________");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
         LocalTime time1 = LocalTime.of(7,15,3);
        System.out.println(time1.format(tf));//07:15:03

        DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("H:m");
        LocalTime time2 = LocalTime.of(7,15);
        System.out.println(time2.format(tf1));//7:15

        System.out.println("____________________________________________________");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));//12/17/2023  02:14 PM

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm a");
        LocalDateTime starts1 = LocalDateTime.now();
        System.out.println(starts1.format(dtf1));   //   Sunday, 12/17/2023  02:22 PM

        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" Date&Time: MM/dd/y  hh:mm a");
        //it will give us illegal argument exception. we can use Patterns symbols only without words

        

    }
}

package week11_OfficeHours;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    public String name;
    public LocalDateTime dateTime;

    public Appointment(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public void updateAppointment(int n){
        dateTime = dateTime.plusDays(n);
    }

    public String toString(){
        return "Appointment: " + name + " on " + dateTime.format(DateTimeFormatter.ofPattern("EEEE M/d/yy")) + " at " + dateTime.format(DateTimeFormatter.ofPattern("h:mm a"));

    }
}
/*

Appointment [class, object, constructor, LocalDateTime, ArrayList]

    create a class Appointment
        instance variables:
            name, LocalDateTime

        create a constructor to initialize all the instance variables

        create a toString method returning the name and formatted date and time

        create a method to change the date of an Appointment by n days, where n is the given parameter

 */
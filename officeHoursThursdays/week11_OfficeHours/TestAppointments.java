package week11_OfficeHours;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TestAppointments {
    public static void main(String[] args) {
        Appointment dentist = new Appointment("Dentist", LocalDateTime.of(2023, 12, 21,15, 0));

        System.out.println(dentist);
        dentist.updateAppointment(3);
        System.out.println(dentist);

        ArrayList<Appointment> allAppointments = new ArrayList<>(Arrays.asList(
                dentist,
                new Appointment("Doctor checkup", LocalDateTime.of(2024, 1, 10, 14, 30)),
                new Appointment("Eye exam", LocalDateTime.of(2024, 1, 11, 16, 30)),
                new Appointment("work party", LocalDateTime.of(2023, 12, 23, 12, 45))
        ));

        for(Appointment each : allAppointments){
            System.out.println(each);
        }

        // EXTRA NOT RELATED TO ANYTHING WE LEARNED - just to print from ArrayList

        System.out.println();
        allAppointments.forEach(System.out::println);

    }
}
/*
    create a Runner class with a main method
    create an ArrayList of Appointments to test
        - check if there is any appointments today
        - find a specific appointment by name and update its date
        - remove any appointments that have already passed
 */
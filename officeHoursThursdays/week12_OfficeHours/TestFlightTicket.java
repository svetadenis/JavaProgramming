package week12_OfficeHours;

import java.time.LocalDateTime;

public class TestFlightTicket {
    public static void main(String[] args) {

        // creating an object with all invalid data, expect for the departure LocalDateTime
        FlightTicket ticket = new FlightTicket("", LocalDateTime.of(2024, 12, 1, 7, 0), "Chicago", "Chicago");
        System.out.println(ticket);

        ticket.setType("First");
        System.out.println(ticket);

        // trying to change to a data that already happened
        ticket.setDeparture(LocalDateTime.of(2022, 5, 1, 7, 0));
        System.out.println(ticket);

        ticket.setDeparture(LocalDateTime.of(2025, 5, 1, 7, 0));
        System.out.println(ticket);

        ticket.setArrivalLocation("Virginia");
        System.out.println(ticket);


    }
}

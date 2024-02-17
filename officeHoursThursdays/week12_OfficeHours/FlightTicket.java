package week12_OfficeHours;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class FlightTicket {

        private String type;
        private LocalDateTime departure;
        private String departureLocation;
        private String arrivalLocation;

        public FlightTicket(String type, LocalDateTime departure, String departureLocation, String arrivalLocation) {
            setType(type);
            setDeparture(departure);
            this.departureLocation = departureLocation;
            setArrivalLocation(arrivalLocation);
        }

        public String getType() {
            return type;
        }

        public void setType(String type) { //type - can only be first, business, or economy
            switch (type.toLowerCase()){
                case "first":
                case "business":
                case "economy":
                    this.type = type;
            }
        }

        public LocalDateTime getDeparture() {
            return departure;
        }

        public void setDeparture(LocalDateTime departure) {
            if(departure.isAfter(LocalDateTime.now())){
                this.departure = departure;
            }
        }

        public String getDepartureLocation() {
            return departureLocation;
        }

        public void setDepartureLocation(String departureLocation) {
            this.departureLocation = departureLocation;
        }

        public String getArrivalLocation() {
            return arrivalLocation;
        }

        public void setArrivalLocation(String arrivalLocation) {
            if(!arrivalLocation.equalsIgnoreCase(departureLocation)){
                this.arrivalLocation = arrivalLocation;
            }
        }

        @Override
        public String toString() {
            return "FlightTicket{" +
                    "type='" + type + '\'' +
                    ", departure=" + departure.format(DateTimeFormatter.ofPattern("EEEE, MM/d/yy | h:mm a")) +
                    ", departureLocation='" + departureLocation + '\'' +
                    ", arrivalLocation='" + arrivalLocation + '\'' +
                    '}';
        }
    }
/*
FlightTicket [Encapsulation, access modifiers, classes, objects, methods, LocalDateTime]

    create a class FlightTicket

    define these instance variables:
        type (String), departure date/time (LocalDateTime), departure location, arrival location

    encapsulate the variables
        in the setters:
            type - can only be first, business, or economy
            arrival location - arrival cannot be the same location as the departure

    create these constructors and chain them to avoid repetition
        - create a constructor that initializes all the variables
            -> call setters methods

    create a toString() to print all the Ticket information
 */


package week11_OfficeHours_Saturdays;

    public class TrafficLight {
        private String color;

        public TrafficLight(String color) {
            setColor(color);
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            if(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("yellow")){
                this.color = color;
            }
        }

        @Override
        public String toString() {
            return "TrafficLight{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
/*
TrafficLight [encapsulation]

    Create a class Traffic Light

    instance variable: color (String)

    the constructor should call the setter method

    encapsulate the class
        the setter: only set the color if it is green, red, or yellow
 */


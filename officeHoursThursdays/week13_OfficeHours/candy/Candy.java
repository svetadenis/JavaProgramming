package week13_OfficeHours.candy;

    public class Candy {

        public static int totalNumberOfCandyCompanies = 4000;
        public static String largestCountryConsumer = "United Sates";

        String brand;
        int quantity;
        boolean containsPeanuts;

        public Candy(String brand, int quantity, boolean containsPeanuts) {
            this.brand = brand;
            this.quantity = quantity;
            this.containsPeanuts = containsPeanuts;
        }

        public String toString(){
            return brand + " - " + quantity + (containsPeanuts ? " has peanuts" : " no peanuts");
        }
    }
/*

Candy [inheritance, constructor, static]

    Create a class Candy

        declare these instance variables:
            - brand (String), quantity (int), contains peanuts (boolean)
                make brand and contains peanuts

        declare a static variables:
            - total number of candy companies: 4000
            - country with largest candy consumption: United States

        create a constructor to set all instance variables

        override toString

    Create a class Take5
        inherits Candy class
        make Take5

        create a constructor that calls the parent constructor

    Create a class Twix
        inherits Candy class
        make Twix

        create a constructor that calls the parent constructor

    Create a class HersheyBar
        inherits Candy class

        create a constructor that calls the parent constructor

    Create a class HersheyKiss
        inherits HersheyBar

        create a constructor that calls the parent constructor

    Create a class CandyFactory
    create a method method
    create the Candy objects to test all the information

 */


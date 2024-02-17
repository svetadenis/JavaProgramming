package week13_OfficeHours.season;

    public class Spring extends Season{
        public Spring(double highestAvgTemp, double lowestAvgTemp) {
            super(highestAvgTemp, lowestAvgTemp);
        }

        @Override
        public void activity() {
            System.out.println("Go outside");
            System.out.println("Smell flowers");
        }
    }
/*
Create a class Spring
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Go Outside
 */


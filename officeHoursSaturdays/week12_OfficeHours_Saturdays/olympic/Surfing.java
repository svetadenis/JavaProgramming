package week12_OfficeHours_Saturdays.olympic;


    public class Surfing extends OlympicSport {
        public Surfing(int participants) {
            super(participants);
        }

        @Override
        public void compete() {
            super.compete();
            System.out.println("Surfing the waves");
        }
    }
/*
	- Create a class Surfing

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Surfing the waves
 */


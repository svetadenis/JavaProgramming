package week12_OfficeHours_Saturdays.olympic;

    public class Soccer extends OlympicSport{

        public int record = 10; // variable hiding

        public Soccer() {
            super(11);
        }


        public static void getNextYear(){
            System.out.println("2030");
        }
        @Override
        public void compete() {
            super.compete();
            System.out.println("Playing a Soccer game");
        }
    }
/*
	- Create a class Soccer

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Playing a soccer game
 */


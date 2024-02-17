package week12_OfficeHours_Saturdays.olympic;

public class OlympicSport {
    public String name;
    public int participants;
    public int record = 10;

    public static int yearOfFirstOlympics = 1896;

//    public OlympicSport(){
//
//    }

    public OlympicSport(int participants) {
        this.name = getClass().getSimpleName();
        this.participants = participants;
    }

    public static void getNextYear(){
        System.out.println("2024");
    }

    public void compete(){
        System.out.println("Competing in Olympics");
    }

    public String toString(){
        return name + ", participants " + participants;
    }

}
/*

OlympicSport [Inheritance, overriding, super constructor, static]

	Create a class OlympicSport

		instance variables
			- name (String)
			- participants (int)

		static variable: year of first Olympics: 1896

		constructor:
			- initialize all fields

		methods:
			- compete()
		-> override compete in sub classes

		 - override toString()

	- Create a class Track

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Track for running, jumping, throwing

 */


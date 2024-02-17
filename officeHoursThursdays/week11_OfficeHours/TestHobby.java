package week11_OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHobby {
    public static void main(String[] args) {
        ArrayList<Hobby> allHobbies = new ArrayList<>(Arrays.asList(
                new Hobby("Reading", 0, false, false),
                new Hobby("Tennis", 200, true, true),
                new Hobby("Dance", 1500, false, true),
                new Hobby("Walk", 0, true, false),
                new Hobby("Climbing", 250, true, false),
                new Hobby("Horse Riding", 600, true, false),
                new Hobby("Golfing", 1000, true, true),
                new Hobby("Kayaking", 120, true, false),
                new Hobby("Swimming", 450, false, false)
        ));

        for(Hobby each : allHobbies){
            each.doIt();
        }

        //create a copy ArrayList and remove all outdoors Hobbies
        ArrayList<Hobby> indoorHobbies = new ArrayList<>(allHobbies);
        indoorHobbies.removeIf(hobby -> hobby.isOutdoors);
        for(Hobby each : indoorHobbies){
            System.out.println(each.name);
        }
        System.out.println();
        //- create a copy ArrayList and remove all hobbies requiring other people

        ArrayList<Hobby> soloHobbies = new ArrayList<>(allHobbies);
        soloHobbies.removeIf(p -> p.requiresOthers);
        soloHobbies.forEach(System.out::println);

        // - create a copy ArrayList and remove all hobbies that cost more than $500 annually
        System.out.println();
        ArrayList<Hobby> lessThan500 = new ArrayList<>(allHobbies);
        lessThan500.removeIf(p -> p.annualCost > 500);
        lessThan500.forEach(System.out::println);

    }
}

/*

    Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */
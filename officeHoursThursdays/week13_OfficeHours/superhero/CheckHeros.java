package week13_OfficeHours.superhero;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckHeros {
    public static void main(String[] args) {

        MarvelHero spiderman = new MarvelHero("Spider Man", "Peter Parker", new ArrayList<>(Arrays.asList("Enhanced strength", "agility", "spider-sense")));

        DCHero batman = new DCHero("Batman", "Bruce Wayne", new ArrayList<>(Arrays.asList("master detective, martial arts, technical tools")), "Gotham");

        System.out.println(spiderman);
        spiderman.protect();
        spiderman.callAvengers();

        System.out.println();

        System.out.println(batman);
        batman.protect();

    }
}

/*
 create a main method
    create Marvel and DC objects and test the variables and methods

    data:
    spider man, peter parker, Marvel, powers: Enhanced strength, agility, and spider-sense
    iron man, tony stark, Marvel, powers: powered suit of armor, flight, enhanced strength
    thor, thor odinson, Marvel, powers: wields hammer, controls lightning, flight
    wonder woman, diana prince, DC, powers: Enhanced strength, speed, agility, durability
    batman, bruce wayne, DC, powers: master detective, martial arts, technical tools
    superman, clark kent, DC, powers: super strength, speed, invulnerability, flight

 */
//Spider Man, Peter Parker, MarvelHero
//[Enhanced strength, agility, spider-sense]
//Spider Man is protecting by any means necessary
//Calling all avengers
//
//Batman, Bruce Wayne, DCHero, Gotham city
//[master detective, martial arts, technical tools]
//Batman is protecting
//Process finished with exit code 0
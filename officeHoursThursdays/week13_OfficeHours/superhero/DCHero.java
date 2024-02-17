package week13_OfficeHours.superhero;

import java.util.ArrayList;

public class DCHero extends SuperHero {
    private String city;

    public DCHero(String name, String realName, ArrayList<String> powers, String city) {
        super(name, realName, powers);
        this.city = city;
    }


    public String getCity() {
        return city;
    }

    @Override
    public void protect() {
        super.protect();
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        String[] old = super.toString().split("\n");
        return old[0] + ", " + city + " city\n" + old[1];
    }
}
/*
Create a class DC
        inherits SuperHero
        make DC

        declare an instance variable: city

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "DC"

        override the protect method()
            print: super_hero protecting with honor
 */
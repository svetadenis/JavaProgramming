package week13_OfficeHours.superhero;

import java.util.ArrayList;

public class SuperHero {

    private String name;
    private String realName;
    private String universe;
    private ArrayList<String> powers;

    public SuperHero(String name, String realName, ArrayList<String> powers) {
        this.name = name;
        this.realName = realName;
        this.universe = getClass().getSimpleName();
        this.powers = new ArrayList<>(powers);
    }

    public void protect(){
        System.out.print(name + " is protecting");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUniverse() {
        return universe;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    //removed setUniverse & setPowers because we didn't want to be able to change them

    public String toString(){
        return name + ", " + realName + ", " + universe + "\n" + powers;
    }

}
/*

SuperHero [inheritance, overriding, constructors, super]

    Create a class SuperHero

        declare these instance variables:
            super hero name, real name, universe, powers (ArrayList of String)
            make the universe

        create a constructor to initialize all the variables

        create an instance method:
            protect() - print $super_hero protecting

        override the toString method
 */
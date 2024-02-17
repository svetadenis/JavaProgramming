package week10_OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;

public class T4StarWarsFactions {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"));
        ArrayList<String> jediOrder = new ArrayList<>();
        ArrayList<String> galacticEmpire = new ArrayList<>();
        ArrayList<String> rebelAlliance = new ArrayList<>();
        for(String each : names){
            if(each.contains("Jedi")){
                jediOrder.add(each);
            } else if(each.contains("imperial") || each.contains("Trooper") || each.contains("officer")){
                galacticEmpire.add(each);
            } else if(each.contains("Rebel") || each.contains("Alliance")){
                rebelAlliance.add(each);
            }
        }

        System.out.println("jediOrder = " + jediOrder);
        System.out.println("galacticEmpire = " + galacticEmpire);
        System.out.println("rebelAlliance = " + rebelAlliance);
    }
}
/*
T4StarWarsFactions [ArrayList, String, Loop]

Create a program that defines an ArrayList with names. Go through the names and separate them into separate ArrayLists based on the faction they belong to. Print all the factions at the end

The factions can be determined by key titles in the names
ignore case sensitivity

titles - & - related factions

jedi - jedi order
imperial, trooper, or officer - galactic empire
rebel, or alliance - rebel alliance

Sample data: Add more data if you want - note: these are just names with a title in them

"Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"

 */
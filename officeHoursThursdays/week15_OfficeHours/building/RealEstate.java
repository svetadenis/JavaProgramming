package week15_OfficeHours.building;

import week14_OfficeHours.building.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RealEstate {
    public static void main(String[] args) {

        House house = new House("123132 Oak Lane", 1_000_000, 5);
        WhiteHouse whiteHouse = new WhiteHouse("DC", 1_000_000_000, "Biden");
        Apartment apartment = new Apartment("9874 Williow Drive", 500_000, 6);
        OfficeBuilding officeBuilding = new OfficeBuilding("21232 Florida Ave", 10_000_000, 8);

        System.out.println(BuildingUtil.rent(house));
        System.out.println(BuildingUtil.rent(apartment));
        System.out.println(BuildingUtil.rent(officeBuilding));

        System.out.println(BuildingUtil.rent(new House("Creek Vila", 420000, 4)));

        System.out.println();
        System.out.println(BuildingUtil.search("FairFax"));
        System.out.println(BuildingUtil.search("Great Falls"));
        System.out.println(BuildingUtil.search("McLean"));

        System.out.println("---------------------------------------");
        ArrayList<Building> allBuildings = new ArrayList<>(Arrays.asList(
                house,
                whiteHouse,
                apartment,
                officeBuilding,
                new OfficeBuilding("21232 Florida Ave, Illinois City, IL 65489 ", 10_000_000, 6),
                new OfficeBuilding("New York", 20_000_000, 20),
                new House("1234 Chandler blvd, Mesa, IL 89256", 586_000, 5),
                new Apartment("9874 Williow Drive, Chicago, IL 58565", 500_000, 15),
                new OfficeBuilding("6789 Orchid lane, Chicago, IL 58712", 22_000_000, 8)
        ));

        System.out.println("----------\n1) Search by location: IL");
        for(Building each : allBuildings){
            if(each.getLocation().contains("IL")){
                System.out.println(each);
            }
        }

        System.out.println("----------\n2) Calculate the rent of all the buildings");
        for(Building each : allBuildings){
            System.out.println(BuildingUtil.rent(each));
        }

        System.out.println("----------\n3) Looking for an office building, but I need to know how many floors there is, and I want to use the elevator method");
        for(Building each : allBuildings){

            if(each instanceof OfficeBuilding){

                OfficeBuilding office = (OfficeBuilding) each;
                System.out.println(office.getLocation() + " | " + office.getNumberOfFloors());
                office.elevator(office.getNumberOfFloors());

                //((OfficeBuilding) each).numberOfFloors

            }

        }

        System.out.println("----------\n4) Most Expensive building");
        Building maxBuilding = allBuildings.get(0); // first Building as initial value
        for(Building each : allBuildings){

            if(each.getPrice() > maxBuilding.getPrice()){
                maxBuilding = each;
            }

        }

        System.out.println(maxBuilding);

        System.out.println("----------\n5) find all the Buildings 1,000,000 - 20,000,000");
        ArrayList<Building> filterByPrice = new ArrayList<>(allBuildings);
        filterByPrice.removeIf(p -> p.getPrice() < 1_000_000 || p.getPrice() > 20_000_000);
        System.out.println(filterByPrice);

    }
}
/*
		create an ArrayList of Building
			-> this can hold objects of House, Apartment, & OfficeBuilding

		create a bunch of House, Apartment, & OfficeBuilding objects and store them into the ArrayList

		mini tasks:

			- Search for a Building in a specific location
			- Iterate through and show the rent of all the buildings
			- Find the most expensive Building, print all its information
			- Find the least expensive Building, print all its information
			- Filter all the Buildings in one location(ex search for buildings in Chicago)
			- Filter all the Buildings within a certain price range

 */
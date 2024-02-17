package week15_OfficeHours.building;

import week14_OfficeHours.building.*;

public class BuildingUtil {

    public static double rent(Building building){
        if(building instanceof House){
            return building.getPrice() / 720;
        } else if(building instanceof Apartment){
            return building.getPrice() / 600;
        } else if(building instanceof OfficeBuilding){
            return building.getPrice() / 1000;
        }
        return 0;
    }

    public static Building search(String location){
        switch (location){
            case "Great Falls":
                return new House(location, 500_000, 4);
            case "FairFax":
                return new Apartment(location, 750_000, 6);
            case "McLean":
                return new OfficeBuilding(location, 3_000_000, 6);
            default:
                return null;
        }
    }

}

/*
Building Part 2 [polymorphism, method, ArrayList]

    - create a class BuildingUtil

        create a static method Rent(Building obj)
            return: double
            parameters: Building type

            implementation:
                if the Building is House type
                    return price / 360 * 2

                if the Building is Apartment type
                    return price / 600

                if the Building is OfficeBuilding type
                    return price / 1000

        create a static method search(String location)
            return: Building
            parameters: String location

            implementation
                if the location is Great Falls return a House object with:
                    location: Great Falls
                    price: 500_000
                    number of residents: 4

                if the location is FairFax return a Apartment object with:
                    location: FairFax
                    price: 750_000
                    month for lease: 6

                if the location is McLean return a OfficeBuilding object with:
                    location: McLean
                    price: 3_000_000
                    number of floors: 6

 */
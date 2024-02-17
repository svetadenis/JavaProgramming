package week13_OfficeHours.access.California;

import week13_OfficeHours.access.Virginia.House;

public class SmallHouse extends House {

    // main method in a different package
    public static void main(String[] args) {
        // direct object - you can only access the public variable
        House house = new House();
        house.address = "1923 Cook Lane";
//        house.price = 1_000_000;
//        house.neighborhoodName = "Java Ridge";
//        house.ownerName = "James";

        // object with inheritance - we can inherit public and protected outside a package
        SmallHouse smallHouse = new SmallHouse();
        smallHouse.address = "12323 Koale Drive";
        smallHouse.price = 10_000_000;
//        smallHouse.neighborhoodName = "Java Ridge";
//        smallHouse.ownerName = "James";

    }

}

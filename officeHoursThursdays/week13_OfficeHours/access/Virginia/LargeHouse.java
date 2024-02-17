package week13_OfficeHours.access.Virginia;

public class LargeHouse extends House{

    // main method in the same package, but different class
    public static void main(String[] args) {
        // direct object
        House house = new House();
        house.address = "1923 Cook Lane";
        house.price = 1_000_000;
        house.neighborhoodName = "Java Ridge";
        //house.ownerName = "James";

        // object with inheritance
        LargeHouse largeHouse = new LargeHouse();
        largeHouse.address = "1231 Mountain Drive";
        largeHouse.price = 2_000_000;
        largeHouse.neighborhoodName = "Coding Cove";
        //largeHouse.ownerName = "James";

    }
}

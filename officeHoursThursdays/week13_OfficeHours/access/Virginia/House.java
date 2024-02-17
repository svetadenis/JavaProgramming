package week13_OfficeHours.access.Virginia;

public class House {
    public String address;
    protected double price;
    String neighborhoodName;
    private String ownerName;

    // main method in the same class
    public static void main(String[] args) {
        House house = new House();
        house.address = "1923 Cook Lane";
        house.price = 1_000_000;
        house.neighborhoodName = "Java Ridge";
        house.ownerName = "James";
    }
}

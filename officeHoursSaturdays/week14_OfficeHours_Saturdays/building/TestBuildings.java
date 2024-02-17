package week14_OfficeHours_Saturdays.building;

public class TestBuildings {
    public static void main(String[] args) {

        House house = new House("131313 Cook Drive", 400_000, 5);
        System.out.println(house);
        house.mowLawn();
        house.pay();

        WhiteHouse whiteHouse = new WhiteHouse("DC", 20_000_000, "Biden");
        System.out.println(whiteHouse);
        whiteHouse.mowLawn();
        whiteHouse.elevator(30);
        whiteHouse.openBalcony();
        whiteHouse.pay();

    }
}
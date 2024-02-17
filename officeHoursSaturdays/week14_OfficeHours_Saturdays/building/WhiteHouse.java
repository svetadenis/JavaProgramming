package week14_OfficeHours_Saturdays.building;

public final class WhiteHouse extends Building implements HasBackyard, HasBalcony, HasElevator {

    private String president;

    public WhiteHouse(String location, double price, String president) {
        super(location, price);
        this.president = president;
    }

    @Override
    public void pay() {
        System.out.println("Being in office");
    }

    @Override
    public void mowLawn() {
        System.out.println("Someone to mow to lawn");
    }

    @Override
    public void openBalcony() {

    }

    @Override
    public void elevator(int floor) {

    }
}
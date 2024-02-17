package week14_OfficeHours.building;

public final class WhiteHouse extends Building implements HasBackYard, HasBalcony, HasElevator {

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
        System.out.println("Balcony open on nice days");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("Going to " + floor + " in the white house");
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + president;
    }
}
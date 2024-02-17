package week14_OfficeHours.building;

public class House extends Building implements HasBackYard{

    private int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying the mortgage");
    }

    @Override
    public void mowLawn() {
        System.out.println("Mowing the backyard");
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numberOfResidents;
    }
}
/*
    - Create an class House
        child class of Building
        implements HasBackyard

        create instance variable
            int number of residents

        create a constructor to assign the location, price, and number of residents

        implement all abstract methods (give some print statements. Ex: Paying for House, or Going into Backyard)

        override the toString to print the location, price, and number of residents
 */
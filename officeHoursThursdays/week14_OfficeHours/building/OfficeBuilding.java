package week14_OfficeHours.building;

public class OfficeBuilding extends Building implements  HasElevator{
    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying for office space");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("Going to floor " + floor + " out of " + numberOfFloors);
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numberOfFloors;
    }
}
/*
    - Create an class OfficeBuilding
        child class of Building
        implements HasElevator

        create instance variable
            int number of floors

        create a constructor to assign the location, price, and number of floors

        implement all abstract methods (give some print statements)

        override the toString to print the location, price, and number of floors
 */
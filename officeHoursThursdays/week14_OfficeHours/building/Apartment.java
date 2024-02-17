package week14_OfficeHours.building;

public class Apartment extends Building implements HasBalcony{
    private int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease) {
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent");
    }

    @Override
    public void openBalcony() {
        System.out.println("Going on personal balcony");
    }

    public int getMonthsOfLease() {
        return monthsOfLease;
    }

    public void setMonthsOfLease(int monthsOfLease) {
        this.monthsOfLease = monthsOfLease;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + monthsOfLease;
    }
}

/*
    - Create a class Apartment
        child class of Building
        implements HasBalcony

        create instance variable
            int months of lease

        create a constructor to assign the location, price, and months of lease

        implement all abstract methods (give some print statements)

        override the toString to print the location, price, and months of lease
 */
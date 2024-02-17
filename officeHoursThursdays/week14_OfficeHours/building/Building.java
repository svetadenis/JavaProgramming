package week14_OfficeHours.building;

public abstract class Building {
    private String location;
    private double price;

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public abstract void pay();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return location + ", $" + price;
    }
}
/*
    - Create an abstract class Building

        create instance variables:
            String location
            double price

        create abstract methods:
            void pay()

        create a constructor to assign the location & price

        override the toString to print the location & price

 */
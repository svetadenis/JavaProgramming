package week15_OfficeHours.generator;

public class Energy {
    double amount;
    String unit;

    public Energy(double amount) {
        this.amount = amount;
        this.unit = "Joules";
    }

    public String toString(){
        return amount + " " + unit;
    }
}
/*
    create a class Energy
    create instance variables:
        amount (double), unit (hard code as "Joules")
    create a constructor to initialize the variables
    override the toString as needed for all classes

 */


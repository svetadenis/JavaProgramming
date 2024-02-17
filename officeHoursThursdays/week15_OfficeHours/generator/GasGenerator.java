package week15_OfficeHours.generator;

public class GasGenerator extends Generator {
    public GasGenerator(double amount, double price, double maxCapacity) {
        super(amount, price, maxCapacity);
    }

    @Override
    public void run() {
        System.out.println("Gas emitting but creating " + super.toString());
    }
}
/*
    create a class GasGenerator that is a sub class of Generator
    create instance variables:
        gas level
    create a constructor to initialize the variables
    override the run method
 */
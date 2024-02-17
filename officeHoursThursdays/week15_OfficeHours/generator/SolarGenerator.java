package week15_OfficeHours.generator;

public class SolarGenerator extends Generator{
    public SolarGenerator(double amount, double price, double maxCapacity) {
        super(amount, price, maxCapacity);
    }

    @Override
    public void run() {
        System.out.println("Solar panel creating " + super.toString());
    }
}

/*
    create a class SolarGenerator that is a sub class of Generator
    create a constructor to initialize the variables
    override the run method

 */
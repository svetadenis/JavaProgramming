package week15_OfficeHours.generator;

public class Generator extends Energy{
    double price;
    double maxCapacity;

    public Generator(double amount, double price, double maxCapacity) {
        super(amount);
        this.price = price;
        this.maxCapacity = maxCapacity;
    }

    public void run(){
        System.out.println("Generator running and creating " + super.toString());
    }
}
/*
    create a class Generator that is a sub class of Energy
    create instance variables:
        price, max capacity
    create a constructor to initialize the variables
    create an instance method: run()
 */
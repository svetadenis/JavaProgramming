package week14_OfficeHours_Saturdays.shopping;

public final class Target extends Shopping implements Shipping{
    @Override
    public void shipItem() {
        System.out.println("Ship to the store");
    }

    @Override
    public void buyItem() {
        System.out.println("Checking out");
    }

    @Override
    public void returnItem() {
        System.out.println("At customer service");
    }
}
/*
    create a concrete class Target
        - Make the class final
        - Inherit Shopping and implement Shipping
        - implement all abstract methods

 */
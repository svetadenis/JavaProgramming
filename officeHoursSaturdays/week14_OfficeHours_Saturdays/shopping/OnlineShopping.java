package week14_OfficeHours_Saturdays.shopping;

public abstract class OnlineShopping extends Shopping implements Shipping {
    public abstract void viewCart();
}

/*
    create an abstract class OnlineShopping
        - Inherit Shopping and implement Shipping
        - Does not need to implement any abstract methods
        - Declare an abstract methods:
            viewCart()
 */
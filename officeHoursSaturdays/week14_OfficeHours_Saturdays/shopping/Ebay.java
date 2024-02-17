package week14_OfficeHours_Saturdays.shopping;

public final class Ebay extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void uploadProduct() {
        System.out.println("Uploading product to Ebay");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing cart on ebay");
    }

    @Override
    public void shipItem() {
        System.out.println("Shipping to given address");
    }

    @Override
    public void buyItem() {
        System.out.println("bought item from person");
    }

    @Override
    public void returnItem() {
        System.out.println("Contact seller to return");
    }
}
/*
    create a concrete class EBay
        - Make the class final
        - Inherit OnlineShopping and implements interface AllowUsersToSell interface
        - Implement all abstract methods

 */

package week14_OfficeHours_Saturdays.shopping;

public final class Amazon extends OnlineShopping{
    @Override
    public void viewCart() {
        System.out.println("Viewing amazon cart");
    }

    @Override
    public void shipItem() {
        System.out.println("Shipping to your home");
    }

    @Override
    public void buyItem() {
        System.out.println("Bought");
    }

    @Override
    public void returnItem() {
        System.out.println("Returned to Amazon warehouse");
    }
}
/*
    create a concrete class Amazon
        - Make the class final
        - Inherit OnlineShopping and implement all abstract methods

 */

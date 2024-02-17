package week14_OfficeHours_Saturdays.shopping;

public class Warehouse {
    public static void main(String[] args) {

        Target target = new Target();
        target.shipItem();
        target.buyItem();
        target.returnItem();
        target.track();

        Amazon amazon = new Amazon();
        amazon.shipItem();
        amazon.buyItem();
        amazon.returnItem();
        amazon.viewCart();
        amazon.track();

        System.out.println(Shipping.validDay());
        System.out.println(Shipping.PLANET);

    }
}

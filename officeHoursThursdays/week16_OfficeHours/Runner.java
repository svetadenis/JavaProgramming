package week16_OfficeHours;

public class Runner {
    public static void main(String[] args){

        // valid cases - no exception occurs

        Library.getLibraryCard("mclean");

        try {
            Library.borrow(false);
        } catch (FailToCheckoutException e) {
            e.printStackTrace();
        }

        // invalid cases - exception occur

        //Library.getLibraryCard("chicago");

        try {
            Library.borrow(true);
        } catch (FailToCheckoutException e) {
            System.out.println("EXCEPTION CAUGHT");
            e.printStackTrace();
        }

    }
}

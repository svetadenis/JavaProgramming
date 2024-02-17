package week14_OfficeHours_Saturdays.shopping;

import java.time.LocalDate;

public interface Shipping {

    String PLANET = "Earth"; // public static final String PLANET

    void shipItem(); //public abstract void shipItem();

    default void track(){
        System.out.println("Tracking package");
    }

    static boolean validDay(){
        return LocalDate.now().getDayOfWeek().getValue() < 6; // MON(1) - FRI(5) | Sat = 6, Sun = 7
    }

}
/*
    create an interface Shipping
        - Declare an abstract methods:
            shipItem()
 */
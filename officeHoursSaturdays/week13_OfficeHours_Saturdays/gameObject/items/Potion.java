package week13_OfficeHours_Saturdays.gameObject.items;

import week13_OfficeHours_Saturdays.gameObject.core.Consumable;
import week13_OfficeHours_Saturdays.gameObject.core.Item;

/*
    create an abstract class Potion that implements the Item & Consumable interfaces
    implement the destroy method
 */
public abstract class Potion implements Item, Consumable {

    @Override
    public void destroy() {
        System.out.println("throw empty potion away");
    }
}
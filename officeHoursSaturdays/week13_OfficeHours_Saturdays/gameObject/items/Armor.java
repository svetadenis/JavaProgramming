package week13_OfficeHours_Saturdays.gameObject.items;

/*
    create a final class Armor that extends Equipment
    implement all abstract methods
 */
public final class Armor extends Equipment {

    @Override
    public void instantiate() {
        System.out.println("Armor was made");
    }

    @Override
    public void use() {
        System.out.println("Putting on armor");
    }

}
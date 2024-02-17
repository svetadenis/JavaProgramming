package week13_OfficeHours_Saturdays.gameObject.items;

/*
    create a final class HealthPotion that extends Potion
    implement all abstract methods

        extra: you can make more sub classes: ManaPotion, SpeedPotion
 */
public final class HealthPotion extends Potion{

    @Override
    public void instantiate() {
        System.out.println("brew health potion");
    }

    @Override
    public void use() {
        System.out.println("gain health");
    }
}

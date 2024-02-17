package week13_OfficeHours_Saturdays.gameObject.characters;

/*
    create a final class Zombie that extends Enemy
    implement all abstract methods

        extra: you can make more sub classes: Spider, Skeleton, etc
 */
public final class Zombie extends Enemy {
    @Override
    public void attack() {
        System.out.println("zombie bites");
    }

    @Override
    public void instantiate() {
        System.out.println("Spawning in hoards");
    }
}


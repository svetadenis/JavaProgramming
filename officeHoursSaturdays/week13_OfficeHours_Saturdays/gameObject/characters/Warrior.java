package week13_OfficeHours_Saturdays.gameObject.characters;

    import week13_OfficeHours_Saturdays.gameObject.characters.PlayerCharacter;

    /*
        create a final class Warrior that extends PlayerCharacter
        implement all abstract methods

            extra: you can make more sub classes: Mage, Archer, etc
     */
    public final class Warrior extends PlayerCharacter {

        public Warrior(String name, int health) {
            super(name, health);
        }

        @Override
        public void levelUp() {
            System.out.println("Warrior gets more hp");
        }

        @Override
        public void attack() {
            System.out.println("Warrior attacks with a sword");
        }

        @Override
        public void instantiate() {
            System.out.println("Created in the castle");
        }
    }

/*
    Warrior is a
                   PlayerCharacter
                   GameObject
                   Character
                   CanLevel

 */


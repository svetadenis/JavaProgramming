package week13_OfficeHours_Saturdays.gameObject.characters;

    import week13_OfficeHours_Saturdays.gameObject.core.Character;

    /*
        create an abstract class Enemy that implements the Character interface
        implement the move method
     */
    public abstract class Enemy implements Character {

        @Override
        public void move() {
            System.out.println(getClass().getSimpleName() + " is moving towards the player");
        }
    }


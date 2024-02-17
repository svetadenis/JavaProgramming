package week13_OfficeHours_Saturdays.gameObject.characters;

import week13_OfficeHours_Saturdays.gameObject.core.CanLevel;
import week13_OfficeHours_Saturdays.gameObject.core.Character;

    /*
        create an abstract class PlayerCharacter that implements the Character and CanLevel interfaces
        create instance variables: name, health
        create a constructor to initialize all the variables
        implement the move method
     */
    public abstract class PlayerCharacter implements Character, CanLevel {

        String name;
        int health;

        public PlayerCharacter(String name, int health) {
            this.name = name;
            this.health = health;
        }

        @Override
        public void move() {
            System.out.println("Player controlling this character");
        }

    }


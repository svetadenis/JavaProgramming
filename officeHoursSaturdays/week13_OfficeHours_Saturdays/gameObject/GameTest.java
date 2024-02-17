package week13_OfficeHours_Saturdays.gameObject;


import week13_OfficeHours_Saturdays.gameObject.characters.Warrior;
import week13_OfficeHours_Saturdays.gameObject.characters.Zombie;
import week13_OfficeHours_Saturdays.gameObject.items.Armor;
import week13_OfficeHours_Saturdays.gameObject.items.HealthPotion;

    public class GameTest {
        public static void main(String[] args) {

            Warrior warrior = new Warrior("Sir Java", 100);
            warrior.instantiate();
            warrior.move();
            warrior.attack();
            warrior.levelUp();

            System.out.println();
            Zombie zombie = new Zombie();
            zombie.instantiate();
            zombie.move();
            zombie.attack();

            System.out.println();
            Armor armor = new Armor(); // Armor is a Item
            armor.instantiate();
            armor.use();
            armor.shop();

            System.out.println();
            HealthPotion healthPotion = new HealthPotion();
            healthPotion.instantiate();
            healthPotion.use();
            healthPotion.destroy();


        }
}

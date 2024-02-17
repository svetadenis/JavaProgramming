package week13_OfficeHours.season;

public class CheckSeason {
    public static void main(String[] args) {

        Winter winter = new Winter(20, -5);
        System.out.println(winter);
        winter.activity();

        Summer summer = new Summer(85, 75);
        System.out.println(summer);
        summer.activity();

        Fall fall = new Fall(50, 35);
        System.out.println(fall);
        fall.activity();

        Spring spring = new Spring(75, 55);
        System.out.println(spring);
        spring.activity();

    }
}

/*

    Create a class CheckSeason

        create an object of Winter, Summer, Fall and Spring and verify if the constructor, toString(), and activity() are working properly for each class
 */
//Winter with temperatures between: 20.0 - -5.0
//Use Fireplace
//Summer with temperatures between: 85.0 - 75.0
//Drink Lemonade
//Fall with temperatures between: 50.0 - 35.0
//Read a book
//Spring with temperatures between: 75.0 - 55.0
//Go outside
//Smell flowers
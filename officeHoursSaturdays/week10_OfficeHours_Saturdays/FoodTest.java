package week10_OfficeHours_Saturdays;
import java.util.Arrays;

public class FoodTest {
    public static void main(String[] args) {

        // test all the constructor and see how the dynamic toString work

        Food pizza = new Food("Pizza");
        System.out.println(pizza);

        Food taco = new Food("Taco", 4);
        System.out.println(taco);

        Food apples = new Food("Apple", 3, 0.99);
        System.out.println(apples);

        apples.quantity = 6;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println(apples.totalPrice);

        System.out.println("----------------------");

        Food[] allFood = {
                new Food("Apple Pie", 2, 9.99),
                new Food("Steak", 4, 14.99),
                new Food("Ashak", 10, 12.99),
                new Food("Avocado", 20, 2.99),
                new Food("Antelope", 1, 100),
                new Food("Coconut", 7, 3.55),
                new Food("Chocolate", 14, 3.2)
        };
        // find all the Food objects that start with 'a' and print the Food object
        for(Food each : allFood){
            if(each.name.startsWith("A")){
                System.out.println(each);
            }
        }

        // calculate the total price of all the foods
        double totalFoodPrice = 0;
        for(Food each : allFood){
            totalFoodPrice += each.totalPrice;
        }
        System.out.println(totalFoodPrice);

        // find all the Food objects that have a total price over 50 and collect the name of the food, print an array
        String foodOver20 = "";
        for(Food each : allFood){
            if(each.totalPrice >= 50){
                foodOver20 += each.name + ",";
            }
        }
        String[] arrFoodOver20 = foodOver20.split(",");
        System.out.println(Arrays.toString(arrFoodOver20));

        System.out.println(Math.abs(-30));
        System.out.println(Math.PI);

        //Integer.MAX_VALUE -> static variable

    }
}
package week9OfficeHours;

public class RecipeTest {

        public static void main(String[] args) {

            T1Recipe pizza = new T1Recipe();
            System.out.println(pizza);
            pizza.setInfo("Pizza", "Dough, Cheese", 4, 11.99);
            System.out.println(pizza);

            System.out.println(pizza.costPerPerson());

            pizza.ingredients += ", peppers";

        }

    }

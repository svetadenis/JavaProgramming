package day25_constractor;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {
    public static void main(String[] args) {

Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

/*ArrayList<Dog>smallDogs = new ArrayList<>();

        for (Dog dog:dogs) {
            if(dog.size.equalsIgnoreCase("small")){
             smallDogs.add(dog);
            }
        }
        System.out.println(smallDogs);//[Dog{name='Molly', breed='Beagle', size='Small', gender=F, age=5, color='White'},
        // Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'},
        // Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}]
//but the dogs was not allowed

 */
        ArrayList<Dog>smallDogs = new ArrayList<>(Arrays.asList(dogs));
        smallDogs.removeIf(p->p.size.equalsIgnoreCase("small"));
        System.out.println(smallDogs);//[Dog{name='Max', breed='Husky', size='Medium', gender=M, age=4, color='Gray'},
        // Dog{name='Chloe', breed='Golden Retriever', size='Large', gender=F, age=8, color='Gold'},
        // Dog{name='Loki', breed='Chow Chow', size='Medium', gender=M, age=7, color='Gold'}]
        System.out.println("_____________________________________");

       /* ArrayList<Dog>youngDogs = new ArrayList<>();
        for (Dog dog:dogs) {
            if(dog.age<=4){
                youngDogs.add(dog);
            }
        }
        System.out.println(youngDogs);//[Dog{name='Max', breed='Husky', size='Medium', gender=M, age=4, color='Gray'},
        // Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'},
        // Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}]*/

        ArrayList<Dog>youngDogs = new ArrayList<>(Arrays.asList(dogs));

        youngDogs.removeIf(p->p.age>4);
        System.out.println(youngDogs);

        System.out.println("_____________________________________");

        ArrayList<Dog>femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p->p.gender == 'M');
        System.out.println(femaleDogs);
        System.out.println("_____________________________________________________");

        ArrayList<Dog>maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p->p.gender == 'F');
        System.out.println(maleDogs);

        System.out.println("_____________________________________________________");



Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

    ArrayList<Dog>list = new ArrayList<>(Arrays.asList(dogs2));//convert to ArrayList
    //System.out.println(Arrays.toString(dogs2));
    list.removeIf(p-> p.size.equalsIgnoreCase("small"));
    dogs2 = list.toArray(new Dog[list.size()]);//convert to Array
    System.out.println(Arrays.toString(dogs2));

    }}

/*
 Give the following array of dogs
    Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
    dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
    dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
    dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
    dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
    dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
    dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

    Note: Dog class is imported from package day17

            1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops
 */
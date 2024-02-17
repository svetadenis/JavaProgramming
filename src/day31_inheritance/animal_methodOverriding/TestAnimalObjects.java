package day31_inheritance.animal_methodOverriding;
public class TestAnimalObjects {

public static void main(String[] args) {

    Cat cat = new Cat("Emily", "Bangle", 'F', 4, "Small", "Gray");

    Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");

    Lion lion = new Lion("Simba", "African Lion", 'M', 6, "Large","Yellow", true);

    Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4, "Medium", "Black & WHite");


    System.out.println(cat);
    System.out.println(dog);
    System.out.println(lion);
    System.out.println(eagle);

    System.out.println("--------------------------------------------------------");

    cat.eat();
    dog.eat();
    eagle.eat();
    lion.eat();

    System.out.println("----------------------------------------------------------");


    cat.sleep();
    dog.sleep();
    eagle.sleep();
    lion.sleep();
}}
//Cat{name='Emily', breed='Bangle', gender=F, age=4, size='Small', color='Gray'}
//Dog{name='Max', breed='Husky', gender=M, age=3, size='Large', color='White'}
//Lion{name='Simba', breed='African Lion', gender=M, age=6, size='Large', color='Yellow', African lion='true'}
//Eagle{name='Bella', breed='American Eagle', gender=F, age=4, size='Medium', color='Black & WHite'}
//--------------------------------------------------------
//Cat Emily is eating cat food
//Dog Max is eating dog food
//Eagle Bella is eating snake
//Lion Simba is eating deer
//----------------------------------------------------------
//Cat Emily sleeps 12 hours ina day
//Max sleeps 8 hours
//Bella sleeps 8 hours
//Simba sleeps 8 hours
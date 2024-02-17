package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {

    Dog   dog1  = new Dog();
// class  object name
    dog1.name = "Max";//diclared a s instance
    dog1.breed = "Husky";
    dog1.gender = 'M';
    dog1.age = 4;
    dog1.size = "Large";
    dog1.color = "Gray";

    dog1.eat();
        System.out.println(dog1);


    Dog dog2 = new Dog();
    dog2.name = "Loki";
    dog2.breed = "Golden Retriever";
    dog2.gender = 'F';
    dog2.age = 2;
    dog2.size="small";
    dog2.color = "orange";


    Dog dog3 = new Dog();
    dog3.setInfo("Bella","Chow Chow",'M',2,"Medium","black");
    System.out.println(dog3);

    Dog dog4 = new Dog();
    dog4.setInfo("Chuck", "Bulldog",'M',5,"small", "white");
    System.out.println(dog4);

    System.out.println(dog4);

    dog2.eat();
    dog2.drink();

    }
}

package week13_OfficeHours_Saturdays.gameObject.core;

/*
    create an interface Item that extends GameObject
    create abstract methods: use()
 */
public interface Item extends GameObject {

    void use();

    default void shop(){
        System.out.println("Shopping");
    }

}

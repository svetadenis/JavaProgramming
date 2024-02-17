package day17_customClass;

public class Person {
    public String firstName;//firstName and age are fields
    public int age;

    public void print() {//instance method. you have an access to field of objects
        System.out.println("Name: " + firstName + ", age = " + age);
    }

    public static void staticMethod() {
        //System.out.println("" + firstName);
    }
}

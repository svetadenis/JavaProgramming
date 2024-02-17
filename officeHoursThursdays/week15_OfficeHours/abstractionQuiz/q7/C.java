package week15_OfficeHours.abstractionQuiz.q7;

interface A {
    void readBook();    // line 1
    abstract void watchTV();
}

abstract class B implements A {
    public void readBook(){
        System.out.println("Reading Book");
    }
}
public class C extends B{
    // line 2
    public void watchTV(){
        System.out.println("Watching TV");
    }

    public void readBook(){
        System.out.println("true = " + true);
    }

    public void exercise(){
        System.out.println("Exercising in the gym");
    }
}

class D{
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.readBook();
        obj1.watchTV();

        B obj2 = new C();
        obj2.readBook();

        A obj3 = new C(); // obj3 is not object itself, reference for the object from parent type
        obj3.readBook();
        ((C)obj3).exercise();  // parent class/interface does not have exercise method so we need to down cast our reference for the object
        // we are downcasting our object reference to child class

        // Dynamic Binding

        /**
         * A ob3 = new C();   what should we call this object? Is this a A object or C object?
         * In memory we created object of C, but we created with a reference (ob3) from A class
         *
         */


    }
}
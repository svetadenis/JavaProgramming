package day25_constractor;

public class ConstractorsIntro {
    //public A(){} it's not a constractor. The name is supposed to be the same as a class name

    //first constructor (with argument)
    public ConstractorsIntro(int a) {//parameters for constarctors must be different.
        //we can have several constractors with the same names
        System.out.println("Object is created by using default constructor");
    }

    //second constructor (without argument)
    public ConstractorsIntro(){
        System.out.println("Object is created by using default constructor");
    }


    public static void add(){
    }


    public static void main(String[] args) {
        ConstractorsIntro obj = new ConstractorsIntro(10);//Object is created by using default constructor
        ConstractorsIntro obj2 = new ConstractorsIntro();//Object is created by using default constructor
        ConstractorsIntro obj3 = new ConstractorsIntro(10);//Object is created by using default constructor
//was created 3 objects. Each of them have own memory.
      //  ConstractorsIntro obj4 = new ConstractorsIntro("Java");
        // we didn't create a constractor with parameter "Java", that's why we have an error


    }
}

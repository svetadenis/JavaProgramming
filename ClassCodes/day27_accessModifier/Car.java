package day27_accessModifier;

public class Car { // outer class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{ // Inner

       public void method(){
           System.out.println(make);
           System.out.println(wheels);
       }

    }


    public static class StaticInnerClass{ // static only accepts static!
        //static class only can be in nested class

        public void method(){
          //  System.out.println(make);
            System.out.println(wheels);
        }

    }}

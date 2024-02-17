package day17_customClass;

public class InstanceMethodTestwithPersonClass {
    //public int something;

    public static void main(String[] args) {
        Person a = new Person();
        // a-instance of class; Person-class
        Person b = new Person();//a and b are objects
        a.age = 11;//age,firstName-fields
        a.firstName = "Vika";//Object a
        a.print();//print - method
        b.age = 13;
        b.firstName = "Kate";
        b.print();//instance method calls on object
        Person.staticMethod();//static method calls on class
    }
}
//Each object have own copies of the fields
package week14_OfficeHours.inheritanceQuiz.test3;

class A {
    public A() {
        System.out.print("A ");
    }
}

class B extends A{
    public B() {
        System.out.print("B ");
    }
}

public class Test extends B {
    public Test() {
        System.out.print("C ");
    }

    public static void main(String[] args) {
        B obj = new B(); // when the B constructor is called the super class constructor will still need to be called
    }
}
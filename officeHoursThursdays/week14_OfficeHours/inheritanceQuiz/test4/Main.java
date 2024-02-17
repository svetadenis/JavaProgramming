package week14_OfficeHours.inheritanceQuiz.test4;

class Test {
    protected void print(){
        System.out.println("Hello World");
    }
}

public class Main extends Test{ // Compilation fails at Main class - because we tried to change the access modifier from protected to default, but we cannot change the access to be less visible

//    @Override
//    void print() {
//        System.out.println("Hello Cydeo");
//    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.print();
    }
}
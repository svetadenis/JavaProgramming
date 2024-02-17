package week15_OfficeHours.abstractionQuiz.q2;

abstract class Data{
    //public abstract static void printHello();
}
public final class Test extends Data{
    //@Override
    public static void printHello(){
        System.out.println("Hello Cydeo");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.printHello();
    }
}
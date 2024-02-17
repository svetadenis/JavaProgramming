package day14_forLoop;

public class OverloadingTheMainMethod {
    public static void main(String[] args) {
        System.out.println("A");//only first main method is true main method, others are overloaded methods
        main(25);//B
        main(10.5);//C
        main(true);//D

    }
    public static void main(int args) {
        System.out.println("B");
    }
    public static void main(double args) {
        System.out.println("C");
    }
    public static void main(boolean args) {
        System.out.println("D");
    }
}



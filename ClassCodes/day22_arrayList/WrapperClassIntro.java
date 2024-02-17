package day22_arrayList;


public class WrapperClassIntro {
    public static void main(String[] args) {

        String  str = "Java";
        int a1 = 10;
        Integer a2 = 10;

        System.out.println("____________________________________________________");

        int b1 =100;
        Integer b2 = b1;//auto boxing

        System.out.println("___________________________________________________");

        char ch = 'A';
        Character ch2 = ch;//Autoboxing

        double d1=5.5;
        Double d2 = d1;//Autoboxing

        System.out.println("________________________________________________");

        Integer n1 = 20;
        int n2 = n1;//unboxing

        Character e1='Z';
        char e2=e1;//unboxing

        System.out.println("_______________________________________________");

    }
}

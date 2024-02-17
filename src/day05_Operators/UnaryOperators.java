package day05_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        //pre increment/decrement
        int x = 10;
        System.out.println(++x); //11
        System.out.println(x);//11

        int y = 100;

        System.out.println(--y);//99
        System.out.println(y);

        System.out.println("_____________________________________________");

        //post increment/decrement
        int a = 50;
        System.out.println(a++);//50
        System.out.println(a);//51
        System.out.println(a--);//51
        System.out.println(a);

        int b = 25;
        System.out.println(b++);//25
        System.out.println(b--);//26
        System.out.println(b);//25

        int z = 60;
        int q = z--; //q=60, z = 59
        System.out.println("q=" +q);
        System.out.println("z=" +q);











    }
}

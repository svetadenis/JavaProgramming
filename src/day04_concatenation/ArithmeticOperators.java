package day04_concatenation;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(100+200);

        System.out.println(40-10);

        System.out.println(50/6);
        System.out.println(50/6.0);
        System.out.println(50.0/6);
        System.out.println(2.5/0.5);//5.0
        System.out.println((int)(2.5/0.5));//5

        System.out.println(20*12);

        //remainder: numenator - (denominator*integer*result)
        //15/4=3.75
        //15-(4*3)=3 remainder is 3
        //if we want to find the remainder, then use %
        //15%4 ===>3

        System.out.println(100%13);//remainder 9

    }

}

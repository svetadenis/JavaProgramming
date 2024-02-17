package day05_Operators;

import java.sql.SQLOutput;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 1000;
        int b = 200;
        System.out.println( a>b );//true
        System.out.println( a<b );//false

        boolean aIsGreater = a>b;
        System.out.println(aIsGreater);//true
        System.out.println("_____________________________________________");

        int score = 75;
        boolean passed = score >=60;
        System.out.println(score);//true

        int age = 21;
        boolean aligebletobuyAlcohol = age>=21;
        System.out.println(aligebletobuyAlcohol);//true
        boolean eligebleToVote = age>=18;
        System.out.println(eligebleToVote);//true
        System.out.println("_______________________________________________");

        System.out.println(100>100);// false
        System.out.println(100>=100);//true
        System.out.println(100>=185);//false
        System.out.println("________________________________________________");

        score = 48;// new value of int score will be 48, not 75
        boolean failed = score < 60;
        System.out.println(failed);//true, because the student score is less then 60
        System.out.println(100<2000);//true
        System.out.println(100<20);//false
        System.out.println("__________________________________________________-");

        System.out.println( 95 <= 100);//true
        System.out.println(100<=100);//true, as long as one condition is true, the operator give us true
        System.out.println(10<=5);//false

        System.out.println("__________________________________________________-");

        System.out.println('a'>'b');// character has a corresponding number. from asci table

                        //  65  66     false
       // System.out.println("Java"<="c#");// compiler, because relational operators can be applied only to numbers














    }
}

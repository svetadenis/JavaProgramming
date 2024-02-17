package day10_string;

import java.util.Scanner;
import java.lang.String;//import statement for String. Given implicitly


public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println(str);
        input.close();
        System.out.println("_______________________________________________");

        String s1 = "Cat";
        String s2 = "Dog";
        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1 == s3);//true
        System.out.println(s1 == s4);//true
        System.out.println(s3 == s4);//true

        System.out.println("__________________________________________________");

        String str1 = new String( "Java");//creates two objects:1.String pool; 2.in heap (outside string)
        String str2 = new String( "Java");
        System.out.println(str1 == str2);//false, because it.s different objects.
        // String pool can't have two or more the same value.
        System.out.println("_________________________________________________");

        String t1 = "Python";
        String t2 = new String ("Python");
        String t3 = new String ("Python");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t1==t2);//false because it's different objects. it's only one object can be store in a String pool
        System.out.println(t2 ==t3);//false, because it's different objects






    }
}

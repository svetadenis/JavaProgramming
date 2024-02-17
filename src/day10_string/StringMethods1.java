package day10_string;
import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {

        //CharAt method
        String str = "Cydeo";
        //index:      01234
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);
        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("________________________________________________");

        //Length method
        String sentence = "Java Programming Language";
        int length = sentence.length();
        System.out.println(length);//25
        int lastIndex = length - 1;
        System.out.println(lastIndex);

        System.out.println("_________________________________________________");

        String s1 = "Wooden Spoon";
        char f = s1.charAt(0);
        int lastIndexNum = s1.length() - 1;
        char l = s1.charAt(lastIndexNum);
        System.out.println(f + " " + l);//w and n First and Last characters
        System.out.println("____________________________________________________");

        String name1 = "Umran";//Java pool
        String name2 = new String("Umran");//Java Heap.
        //name 1 and name 2 are two different objects
        System.out.println(name1 == name2);//false, because it's two different objects
        System.out.println(name1.equals(name2));//true, because we want to compare their values

        System.out.println("_____________________________________________________");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");

        System.out.println(r1 == r2);//true the same objects
        System.out.println(r1 == r3);//false, it's different objects. String r1 goes to Java Pool
        //String r3 goes to Java Heap.
        System.out.println(r2 == r3);//false, it's different objects. String r1 goes to Java Pool
        //String r3 goes to Java Heap.

        System.out.println(r1.equals(r3));//true, we want to compare value, not objects
        System.out.println(r2.equals(r3));//true, we want to compare value, not objects
        System.out.println("_______________________________________________________");

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();
        if (age >= 21 && answer.equals ("yes")){
            System.out.println("Eligible to vote");
         }else{
        System.out.println("Not eligible to vote");
    }

    }
}

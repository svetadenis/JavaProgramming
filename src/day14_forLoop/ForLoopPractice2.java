package day14_forLoop;
import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int sum = 0;
    for(int i=0; i<10; i++){//we put numbers 9 times, when we put number tenth time, the [rogram
        //calculate sum all numers what we entered

    System.out.println("Enter a number:");

    sum+=input.nextInt();}

    System.out.println("sum= "+sum);
    }
}

package day15_whileLoop;
import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max=-2147483647;//we will have a bug if we assign it to a negatuve number
//any integer number that user enter will always be greter then -2147483647
        for(int i=0;i<5;i++){
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num>max){//if the user entered entry is greater than the current maximum number that we have
                max=num;//then user entered number shoud be the maximum number
            }

        }
        System.out.println("max= "+max);
    }
}




//1.Write a program that can ask the user to enter a number for five times and returns the maximum numbers.class
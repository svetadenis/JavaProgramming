package day15_whileLoop;
import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 2147483647;//we are giving this number is a default; the user always entry the number less waht we are given
//any integer number that user enter will always be less then 2147483647
        for (int i=0; i<5;i++){
            System.out.println("Enter a number: ");//20,30,-5,100,200
            int num = input.nextInt();
            if(num<min){//if the use entered entry is less that the current minimum number that we have
                min=num;//then user entered number should be the minimum number
            }
        }
        System.out.println("Minimum number is: "+min);
    }
}

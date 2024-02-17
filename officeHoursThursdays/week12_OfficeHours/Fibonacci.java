package week12_OfficeHours;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        System.out.println(Arrays.toString(fib));

        for(int i = 2; i < n; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(Arrays.toString(fib));

        fib2(10);
    }

    public static void fib2(int n){
        int a = 0;
        int b = 1;

        for(int i = 2; i < n; i++){
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(b);
    }

}
/*
Fibonacci [IQ][problem-solving, array, loop]

    the Fibonacci sequence is a sequence of numbers that are built by calculating the sum of the previous two numbers
    the sequence always starts with 0 and 1 and to calculate the rest of the sequence the previous two numbers are added together
    for example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        0 + 1 -> 1
        1 + 1 -> 2
        1 + 2 -> 3
        2 + 3 -> 5
        etc

    create an array, with size n, with the elements being the Fibonacci sequence
    if n is 10 then give 10 numbers of the sequence
    if n is 20 then given 20 numbers of the sequence
 */

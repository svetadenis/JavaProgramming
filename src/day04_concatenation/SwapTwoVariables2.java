package day04_concatenation;

public class SwapTwoVariables2 {
    public static void main(String[] args) {
        /*
 Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y
 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15
        output:
                  x = 15
                  y = 10
         */
int x = 15;
int y = 10;

x = x + y;//15+10=25; x is not 15 anymore
y = x - y;//25-10=15; now y = 15 and it's not longer 10;
x = x - y;//now we have x = 25 anf y = 25-15=10

        System.out.println(x);
        System.out.println(y);
    }
}

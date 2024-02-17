package day09_scanner;

import java.util.Scanner;
//import java.util.*; requared more storage

/*
import statement: used for importing one java file to another

        regular import: imports one single class from the specified package
            import package.className

        wild import: imports everything from the package
            import package.*;
 */
public class ScannerIntro {
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);//for reading user inputs
        System.out.println("Enter your first number: ");
    byte num1 = input.nextByte();//-128~127
        System.out.println("Enter your second number: ");
    short num2 = input.nextShort();
        System.out.println("Enter your third number: ");
    int num3 = input.nextInt();
        System.out.println("Enter your forth number: ");
    long num4 = input.nextLong();
        System.out.println("Enter your fifths number: ");
        long num5 = input.nextLong();

        input.close();//scanner is closed, can not read user outputs again

       /* System.out.println("Enter your fifth number: ");
        int num6 = input.nextInt();
        scanner is closed at line 30, once it closed, can't read inputs*/


    System.out.println("First number: " +num1);
    System.out.println("Second number: " +num2);
    System.out.println("Third number:" +num3);
    System.out.println("Fourth:" +num4);
    System.out.println("Fifths:" +num5);
    //System.out.println("Sixs number is:" +num6);







    }

}

package day03_Variables;

public class GallonsToLiters {
    public static void main(String[] args) {
        /*
        Create a class named GallonsToLiters and declare the following variables:
                gallon
                liters

    4.1 Write a program that can convert the any given number of gallons to liters
        Ex:
              gallon = 10

     ƒÏƒ   output:
              10 gallons is equal to 37.9 litters

           Hint:  1 gal = 3.79 L
         */
int gallon = 10;
double litters = gallon*3.79;

        System.out.println(gallon +" gallons " + "is equal to " +litters +" litters");
    }
}

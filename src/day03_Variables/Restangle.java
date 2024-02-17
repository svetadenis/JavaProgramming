package day03_Variables;

public class Restangle {

    public static void main(String[] args) {
        /*
        1. Create a class named Rectangle.java
2. Declare the following variables:

1. width
2. Length
3. Write a program that can display the area of the rectangle
Hints: area = width * length
         */
        int width = 5,
        length = 3,
        area = width*length;
        System.out.println("area = " + area);
        System.out.println("____________________________________________________");

        double width2 = 3.5,
        length2 = 7.5,
        area2 = width2 * length2;
        System.out.println("area2 = " + area2);
        System.out.println("____________________________________________________");

        char width3 = 'a';//a=97 in ascil table
        char length3 = 'b';//b=98 in ascil table
        int area3 = 'a' + 'b';
        System.out.println("area3 = " + area3);

        /*float width = 2.5f;
        float length = 3.0f;
        float area = width*length;
        System.out.println("area = " + area);
        I choose float in first time, but had to choose double,because it's more common */






    }
}

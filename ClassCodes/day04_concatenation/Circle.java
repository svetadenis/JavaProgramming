package day04_concatenation;

public class Circle {

            /*
            6. Create a class named Circle and declare the following variables:
                        radius
                        area
                        perimeter

            6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
                    Ex:
                          radius = 5

                    output:
                           Area of the circle is 78.5
                           Perimeter of the circle is 31.4
             */
            public static void main(String[] args) {
                int radius = 5;
                double perimeter = 2 * 3.14 * radius;

                double area = 3.14*(2*radius/2)*(2*radius/2);
                System.out.println("Area of the circle is "+area);
                System.out.println("Perimeter of the circle is " +perimeter);

    }
}

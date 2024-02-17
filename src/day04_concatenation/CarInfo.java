package day04_concatenation;

public class CarInfo {
    /*
1. Create a class named CarInfo.java
2. Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. Price
3. Use concatenation to print the full info of the car in the following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000.
     */
    public static void main(String[] args) {
        int year = 2018;
        String model = "Toyota Camry";
        int miles = 50000;
        String color = "Red";
        int price = 19000;

        System.out.println("Car information is:");
        System.out.println(year + " " + model + ", " + miles + " miles" + ", " + color + ", " + "$" +price);

    }

}

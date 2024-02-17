package day06_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {

       int  age = 18;

        if (age >= 21){
            System.out.println("You are eligible to buy Cigarettes");
        }
        if (age < 21){
            System.out.println("You are not eligible to buy Cigarettes");
        }
    }
}
/* A variable named age is declared and given. Write a program that can check if the person is eligible to buy cigaretts.
Ex:
age = 28;
output:
You are not eligible to buy Cigarettes.*/
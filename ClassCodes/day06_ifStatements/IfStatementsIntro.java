package day06_ifStatements;

public class IfStatementsIntro {
    public static void main(String[] args) {

        int number = -100;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        if( isPositive) {
            System.out.println(number +" is positive");
        }
        //this statement will be executed only if the number is positive
        if (isNegative){
            System.out.println(number + " is negative");
        }
        //this statement will be executed only if the number is negative

        if (isZero){
            System.out.println(number + " is zero");
        }
        //this statement will be executed only if the number is equal 0

        System.out.println("__________________________________________");

        int num = 0;
        if(num > 0){
            System.out.println(num + " is positive number");
        }
        if (num<0){
            System.out.println(num + " is negative number");
        }

        if (num==0){
            System.out.println(num + " is zero");

        }



            ;






    }
}
//executed 100 is negative
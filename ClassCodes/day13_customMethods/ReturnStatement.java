package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {
        eligible(25);//void method
        System.out.println("_______________________________________________");

        System.out.println("Test started");
        boolean exit=true;
        if (exit){
            return;//main method gets terminated
            //System.out.println("hello");error
        }
        System.out.println("Test1 completed");//main method gets terminated
        System.out.println("Test2 started");


        int total=multiplication(3,5);//int method
        System.out.println(total);//15
    }

    public static void eligible(int age){//void method
        if(age<0||age>120){
            System.out.println("invalid age: +age");
            return;//exits the method
            //if the age is invalid, then the method gets terminated
        }
        if(age>=21){
            System.out.println("You are eligible o buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }
    }
    public static int multiplication (int n1, int n2){//int method
        int result = n1*n2;
        return result;

    }
}

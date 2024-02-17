package day14_forLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args){

        System.out.println(sum(10,20));//all four will be executed 30
        System.out.println(sum(10,20,30));//60
        System.out.println (sum(2.5,3.5));//6.0
        System.out.println((sum(1.5,10.5,2.5)));//14.5
        System.out.println(sum(10,10.5));//20.5 will be executed as well because we have int and double methods
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static int sum(int num1, int num2, int num3){
        //return num1+num2+num3;
        return sum(num1, num2) + num3;
    }
    public static int sum(int num1,int num2,int num3, int num4){
        return sum(num1,num2,num3)+num4;
    }
    public static double sum(double num1,double num2){
        return num1+num2;
    }
    public static double sum(double num1, double num2, double num3){
        return sum(num1,num2)+num3;
    }

}

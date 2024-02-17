package day13_customMethods;
public class ReturnMethodIntro {
    public static void main(String[] args) {

        //int total=sum(20,40);//sum is a void method.Void method doesn't return any data

       int total = addition(10, 20);//30
        System.out.println(total);
        System.out.println("________________________________________");

        int square = square(2);
        System.out.println(square);//4

        System.out.println("_________________________________________");

        int cube = cube(3);
        System.out.println(cube);
    }

    /*public static void sum(int n1, int n2){
        int result = n1+n2;
        System.out.println(result);*/

    public static int addition(int n1, int n2){
    int result = n1+n2;
    return result;
    }

    public static int square(int num){
    int square = num*num;
    return square;


    }

    public static int cube(int num){
       // int cube = num*num*num;
        int cube = square(num)*num;
        return cube;

    }
}




package week10_December11th;

public class HelloName {
    public static void main(String[] args) {

        System.out.println(helloName("Arthur"));
    }

    public static String helloName(String name) {

        //solution1
        //return "Hello "+ name+ "!";

        //solution2
        return "Hello ".concat(name).concat("!");

    }

}


package week10_December11th;

public class LeftTwo {
    public static void main(String[] args) {
        System.out.println(left2("Cydeo"));

    }
    public static String left2(String str) {

        return str.length()>=2  ? str.substring(2)+(str.substring(0,2)) : str;
    }
    }


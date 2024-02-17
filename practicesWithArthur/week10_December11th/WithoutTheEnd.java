package week10_December11th;

public class WithoutTheEnd {
    public static void main(String[] args) {
        System.out.println(withoutEnd("Fahrenheit 451"));
    }
    public static String withoutEnd(String str) {

        //solution1
        return str.substring(1,str.length()-1);//ahrenheit 45

        //solution2
        //return str.length()>=2? str.substring(1,str.length()-1) : str;
    }

}


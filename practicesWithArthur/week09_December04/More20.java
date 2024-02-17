package week09_December04;

public class More20 {
    public static void main(String[] args) {
        System.out.println(more20(-19));
    }
    public static boolean more20(int n) {

        //solution1
        //return n%20 ==1 || n%20 ==2;

        //solution2
        return n%20 <3 && n%20!=0;
    }
    }


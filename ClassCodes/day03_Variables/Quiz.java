package day03_Variables;

public class Quiz {
    public static void main(String[] args) {
        int s1 = 50;
        int s2 = 200;
        s1=s2;
        System.out.println(s1);
        System.out.println(s2);


        long a1 = 3000L;
        double b = (float)a1;
        int c = (short) b;
        System.out.println(c % 1000);

        long a3 = 30L;
        short b3 = (short)a3;


        float a4 = 100459f;
        byte b4 = (byte)a4;
        double c4 = b4;

        System.out.println("5+2 = " +3+4);
        System.out.println("5+2 = " +(+3+4));

        System.out.println("Result A" +0+1);
        System.out.println("Result A" +1+2);







    }
}

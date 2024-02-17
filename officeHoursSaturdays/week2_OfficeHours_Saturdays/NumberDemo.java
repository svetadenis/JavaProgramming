package week2_OfficeHours_Saturdays;

public class NumberDemo {
    public static void main(String[] args) {

        int i = 5;
        long l = i;

        long l2 = 100; // 100 is int, int can be assigned into a long automatically
        byte b = (byte)l2;

        long l3 = 1000000000000L;

        // data loss with decimal(float numbers)
        double d = 10.99;
        int i2 = (int)d; // double is bigger than int, so I have to cast
        float f = i2;

        System.out.println(i2);
        System.out.println(f);

        int i3 = 5600;
        byte b2 = (byte)i3;
        System.out.println(b2);

        float f2 = 10.2F;
        float f3 = (float)10.2;


    }
}
package week5OfficeHours;

    import java.util.Scanner;

    public class Angles {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter 3 angles");
            int angle1 = input.nextInt();
            int angle2 = input.nextInt();
            int angle3 = input.nextInt();
            int sum = angle1 + angle2 + angle3;
            System.out.println( sum == 180 ? "Triangle" : sum == 360 ? "Circle" : "Cannot determine");

            System.out.println("====== alternative solution ======");

            int num = 1;
            int sum2 = 0;
            System.out.println("Enter angle " + num++);
            sum2 += input.nextInt();
            System.out.println("Enter angle " + num++);
            sum2 += input.nextInt();
            System.out.println("Enter angle " + num++);
            sum2 += input.nextInt();
            System.out.println( sum2 == 180 ? "Triangle" : sum2 == 360 ? "Circle" : "Cannot determine");

        }
    }
/*

T2Angles [Scanner, ternary]

	create a program that will ask the user to enter 3 angles. Add to sum of the angles and print what type of shape is made from the angles.
		If the angles add up to 180 print triangle.
		If the angles add up to 360 print circle
		For any other angle print: Cannot determine
 */


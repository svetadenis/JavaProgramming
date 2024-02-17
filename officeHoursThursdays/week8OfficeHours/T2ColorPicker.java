package week8OfficeHours;
import java.util.Scanner;
public class T2ColorPicker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String colors = "";
        int numOfColors = 0;

        do{
            System.out.println("Enter a color");
            String nextColor = input.next();

            if(colors.contains(nextColor)){
                System.out.println("Sorry, pick a unique color");
            } else {
                colors += nextColor + ", ";
                numOfColors++;
            }
        } while(numOfColors < 3);

        System.out.println("Here are the colors you picked: " + colors.substring(0, colors.length() - 2));
    }
}
/*
T2ColorPicker [loop, Scanner, String]

    Create a program that will allow the user to select three unique colors.
    Ask the user to enter their colors one at a time. Verify the color hasn't been selected already.
    If the color is unique add it to the final selection otherwise tell the user the colors should be unique and allow them to reenter a different color.
    The number of iterations is not fixed

    Ex flow:
        Enter color 1:
            > red
        red added
        Enter color 2:
            > red
        red is already selected
        Enter color 2:
            > green
        green added
        Enter color 3:
            > red
        red is already selected
        Enter color 3:
            > green
        green is already selected
        Enter color 3:
            > orange
        orange added

        Here are the colors you picked: red, green, orange

 */


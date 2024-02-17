package week10_OfficeHours;

import java.util.Arrays;

public class week10_ArrayQuiz {
        public static void main(String[] args) {

            System.out.println("======= Question 3 =======");
            char[] array = {'D', 'C', 'B', 'A'};
            Arrays.sort(array);

            for (char each : array) {
                System.out.print(each + " ");
                if (each == 'D') {
                    continue;
                }
            }

            // the if statement and continue are not doing anything since the print statement is before them

            System.out.println();
            System.out.println("======= Question 4 =======");
            // main thing to remember for this is how switch is executed. the case is matched, and it continues execution until the end of the switch or a break statement

            int wd = 0;
            String[] days = {"Sun", "Mon", "Wed", "Sat"};
            for (int i = 0; i < days.length; i++) {
                switch (days[i]) {
                    case "Sat":
                    case "Sun":
                        wd -= 1;
                        break;
                    case "Mon":
                        wd += 1;
                    case "Wed":
                        wd += 2;
                }
            }
            System.out.println(wd); // sun -1, Mon 0  2 , Wed 4, Sat 3    wd = 3

            System.out.println("======= Question 5 =======");
            // we will discuss more about objects and references on Saturday
            int[] num1 = new int[3];
            int[] num2 = {1, 2, 3, 4, 5};
            num1 = num2; // at this point both references, num1 and num2, both point to the same object
            for (int i = 0; i < num2.length; i++) {
                System.out.println(num1[i]);
            }

            System.out.println("======= Question 6 =======");
            System.out.println("FALSE | The array is a primitive type that can hold multiple values of the same and different types");
            // arrays are object types

            System.out.println("======= Question 7 =======");
            System.out.println("TRUE | The array is an ordered data structure, the order of the elements is always preserved");
            // arrays have indexes that allow the elements to be accessed


            System.out.println("======= Question 9 =======");
            String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
            int x = planets.length; // the length of the array
            int y = planets[1].length(); // the length of the String element at index 1
            System.out.println(x + " " + y);

            System.out.println("======= Question 10 =======");
            int[] arr = {1, 2, 3, 4};
            int i = 0;
            do {
                System.out.println(arr[i] + " ");
                i++;
            } while (i < arr.length - 1);

            // the 4 will not be printed because when i is equal to 3 the loop will not iterate again

        }
}

package week10_OfficeHours_Saturdays.ExtraChallenge;

import java.util.Arrays;
import java.util.Random;

    // create an array of 10 random numbers
    public class RandomNumbers {

        public static int[] getRandomArray() {
            int[] arr = new int[10];
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1000) + 1; // the numbers generated will be between 1 - 1000. If you wanted a smaller range change the argument
            }
            return arr;
        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(getRandomArray()));
            System.out.println(Arrays.toString(getRandomArray()));
        }

    }


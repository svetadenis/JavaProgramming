package week9_OfficeHours_Saturday;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AverageEach {
    public static void main(String[] args) {

        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        double totalSum = 0;
        int totalLength = 0;
        DecimalFormat df = new DecimalFormat("0.0#");
        // sum = 0
        for(int[] each1DArr : nums){
            double sum = 0; // I want to reset this back to 0 each iteration of the outer loop
            for(int eachNum : each1DArr){
                sum += eachNum;
            }
            totalSum += sum;
            totalLength += each1DArr.length;
            System.out.println("average of: " + Arrays.toString(each1DArr) + " is " + df.format(sum / each1DArr.length));
        }

        System.out.println("average of all is " + df.format(totalSum / totalLength));

    }
}
/*
AverageEach [multidimensional, loop]

    Create a program that will define a 2D int array with some numbers. Go through and calculate the average of each inner array and the average of the whole 2D array

    Ex:
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
            average of: [3, 4, 5, 6] is 4.5
            average of: [5, 2, 6] is 4.33
            average of: [10, 40, 20] is 23.33
            average of all is 10.1
 */
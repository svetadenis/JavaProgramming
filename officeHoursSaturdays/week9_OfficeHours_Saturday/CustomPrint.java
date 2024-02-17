package week9_OfficeHours_Saturday;

import java.util.Arrays;

public class CustomPrint {

    public static String multiToString(int[][] arr){

        String result = "";

        for(int i = 0; i < arr.length; i++){ // iterate through the 2d array -> go through each array element
            result += "index " + i + " | ";
            for(int j = 0; j < arr[i].length; j++){ // iterate through each 1d array -> go through each number element
                result += "(" + arr[i][j] +  ")";
            }
            result += "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        int [][] nums = {  // nums.length -> 5
                {3, 4, 5, 6}, // nums[0].length -> 4
                {5, 2, 6}, // nums[1].length -> 3
                {10, 40, 20}, // nums[2].length -> 3
                {13}, // nums[3].length -> 1
                {15, 12} // nums[4].length -> 2
        };

        System.out.println("BUILT IN METHOD");
        System.out.println(Arrays.deepToString(nums));

        System.out.println("CUSTOM METHOD");
        System.out.println(multiToString(nums));


    }

}
/*
CustomPrint [multidimensional, loop, String, method]

     Create a method that will accept a 2D int array and return a String format of the array. Make your own custom print format for this 2D array instead of using the deepToString() method

     Ex:    this is just an example. You can be creative for how the 2D array will be printed
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
            index 0 | (3)(4)(5)(6)
            index 1 | (5)(2)(6)
            index 2 | (10)(40)(20)
 */
package week16_Arrays;

import java.util.Arrays;

public class MakeMiddle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeMiddle(new int[]{1,2,3,4})));
    }
    public static int[] makeMiddle(int[] nums) {
        //solution1 with new array
        // int[] myArray = new int[2];
        // int middle = nums.length / 2;

        // myArray[0] = nums[middle - 1];
        // myArray[1] = nums[middle];

        // return myArray;

        //solution2 direct return
        int middle = nums.length / 2;
        return new int[]{nums[middle - 1], nums[middle]};

        //solution3 direct return one line
        //return new int []{nums[nums.length/2-1],nums[nums.length/2]};
    }}
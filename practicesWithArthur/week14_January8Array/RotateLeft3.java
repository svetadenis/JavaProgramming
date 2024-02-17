package week14_January8Array;

import java.util.Arrays;

public class RotateLeft3 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(rotateLeft3(new int[]{1, 2, 3})));


    }
    public static int[] rotateLeft3(int[] nums) {

        //solution1(with new array declaration+instantiation and then initialization)

        //int[] resultArr;             //declare
        //resultArr = new int[3];        //instantiate
        // int[] resultArr = new int[3];  //declare+instantiate
        // resultArr[0] = nums[1];
        // resultArr[1] = nums[2];
        // resultArr[2] = nums[0];
        // return resultArr;

        //solution2(without creating new array)
        // int num0=nums[0];
        // nums[0]=nums[1];
        // nums[1]=nums[2];
        // nums[2]=num0;
        // return nums;

        //solution3 (direct return)
        //return new int[]{nums[1],nums[2],nums[0]};

        //solution4(for loop i:1)
        // int temp = nums[0];

        // for(int i = 1; i < nums.length; i++) {
        //   nums[i - 1] = nums[i];
        // }
        // nums[nums.length - 1] = temp;

        // return nums;

        //solution5(for loop i:0)
        // int temp = nums[0];

        // for(int i = 0; i < nums.length-1; i++) {
        //   nums[i] = nums[i+1];
        // }
        // nums[nums.length - 1] = temp;

        // return nums;



        //solution5(with new array declaration without temp variable)
        int[] resultArr = new int[nums.length];

        for(int i = 1; i < nums.length; i++) {
            resultArr[i - 1] = nums[i];
        }
        resultArr[resultArr.length - 1] = nums[0];//due to not reassigning to nums
        //array we can call nums[0]here

        return resultArr;


    }

}
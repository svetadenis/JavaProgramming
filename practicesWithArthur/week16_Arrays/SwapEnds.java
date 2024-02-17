package week16_Arrays;

import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapEnds(new int[]{1,2,3,4})));
    }
    public static int[] swapEnds(int[] nums) {
        //solution1 (Take first element as temp value )
        // int firstElement=nums[0];
        // nums[0]=nums[nums.length-1];
        // nums[nums.length-1]= firstElement;
        // return nums;

        //solution2 (Take last element as temp value )
        // int lastElement=nums[nums.length-1];
        // nums[nums.length-1]= nums[0];
        // nums[0]=lastElement;
        // return nums;

        //solution3 (for loop)
        //   int[] myArray = new int [nums.length];

        // for (int i = 0; i <nums.length; i++){
        //   myArray[i] = nums[i];
        // }

        // myArray[0] =  nums[nums.length-1];
        // myArray[myArray.length-1] = nums[0];

        // return myArray;

        //solution4 (for loop without looping first and last loop)
//        int[] myArray = new int [nums.length];
//
//        myArray[0] =  nums[nums.length-1];
//        myArray[myArray.length-1] = nums[0];
//
//        for (int i = 1; i <nums.length-1; i++){
//            myArray[i] = nums[i];
//        }
//
//        return myArray;

        //solution5 What exactly is the for loop doing at previous solution and what is its purpose?
        //(Arrays.copyOf() method)
        int[] myArray =  Arrays.copyOf(nums, nums.length);

        myArray[0] =  nums[nums.length-1];
        myArray[myArray.length-1] = nums[0];

        return myArray;
    }

}


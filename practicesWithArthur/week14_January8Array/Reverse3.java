package week14_January8Array;

import java.util.Arrays;

public class Reverse3 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse3(new int[]{1,2,3})));

    }

    public static int[] reverse3(int[] nums) {

        //solution1(with new array)
        // int[] resultArr = new int[3];
        // resultArr[0] = nums[2];
        // resultArr[1] = nums[1];
        // resultArr[2] = nums[0];
        //return resultArr;

        //solution2(with for loop)
        // int[]resultArr= new int[3];
        // for (int i=0; i<nums.length; i++){
        //   resultArr[i]=nums[ (nums.length-1) - i]; //0 --> 2-0(2)
        //                                               //1 --> 2-1(1)
        //                                               //2 --> 2-2(0)
        // }
        // return resultArr;

        //solution3(better understanding solution2)
        // int[]resultArr= new int[3];
        // int lastIndex=nums.length-1;
        // for (int i=0; i<=lastIndex; i++){
        //   resultArr[i]=nums[ lastIndex - i];
        // }
        // return resultArr;

        //solution4(with for loop decreasing iteration)
        // int[]resultArr= new int[3];
        // int lastIndex=nums.length-1;
        // for (int i=lastIndex; i>=0; i--){
        //   resultArr[i]=nums[ lastIndex - i];        //  2 --> 2-2(0)
        //                                             //  1 --> 2-1(1)
        //                                             //  0 --> 2-0(2)

        // }
        // return resultArr;

        //solution5(two variables in for loop)
        int[] reversed = new int[nums.length];
        for(int i = nums.length-1, j =0; i >= 0; i--, j++){
            reversed[j] = nums[i];
        }
        return reversed;


        // //question1 "Is it possible to decleare an array without size?
        // //Actually Yes. We can declare an array without size
        // //but before using it needs to be initialized.

        // int[]resultArr;
        // resultArr= new int[3];
        // int lastIndex=nums.length-1;
        // for (int i=0; i<=lastIndex; i++){
        //   resultArr[i]=nums[ lastIndex - i];
        // }
        // return resultArr;

        //question2 "If the length of given(nums) array is not known?

        // int[]resultArr= new int[nums.length];
        // int lastIndex=nums.length-1;
        // for (int i=0; i<=lastIndex; i++){
        //   resultArr[i]=nums[ lastIndex - i];
        // }
        // return resultArr;

        //question3 "What is the difference of the size of an array nad the capacity of an array? "
    }



}

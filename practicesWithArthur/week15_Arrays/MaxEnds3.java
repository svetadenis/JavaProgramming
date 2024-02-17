package week15_Arrays;


import java.util.Arrays;

public class MaxEnds3 {
public static void main(String[] args) {

    System.out.println(Arrays.toString(maxEnd3(new int[]{1,2,3})));

}
public static int[] maxEnd3(int[] nums) {

    //solution1(ternaries)
    //return nums[0]>nums[2]? new int[]{nums[0],nums[0],nums[0]} : new int[]{nums[2],nums[2],nums[2]} ;

    //solution2 (with loop nested inside if statement)
    // if(nums[0]>nums[2]){
    //   for(int i=0; i<nums.length; i++){
    //     nums[i]=nums[0];
    //   }
    // }  for(int i=0; i<nums.length; i++){
    //     nums[i]=nums[2];
    //   }
    // return nums;

    //solution3 (with if statement  nested inside loop )


    //   for(int i=0; i<nums.length; i++){

    //     if(nums[0]>nums[2]){
    //     nums[i]=nums[0];
    //   }else nums[i]=nums[2];
    //   }
    // return nums;

    //solution4(Math.max() method)
    // int larger = Math.max(nums[0], nums[2]);

    // nums[0] = larger;
    // nums[1] = larger;
    // nums[2] = larger;
    // return nums;

    //solution5(Math.max() method shorter way)
    // int larger = Math.max(nums[0], nums[2]);

    // nums[0] = nums[1] = nums[2] = larger;

    // return nums;

    //solution6
    int larger = Math.max(nums[0],nums[nums.length-1]);

    return new int[]{larger,larger, larger};
}

}


package week14_January8Array;

public class SameFirstLast {
    public static void main(String[] args) {

        //Calling&Printing Method1
        int[] nums = {1,2,6,1};
        System.out.println(sameFirstLast(nums));

        //Calling&Printing Method2
        System.out.println(sameFirstLast(new int[]{1, 2, 6, 2}));

    }
    public static boolean sameFirstLast(int[] nums) {
        //solution1
        if (nums.length >= 1) if (nums[0] == nums[nums.length - 1]) return true;
        return false;

        //solution2
        // return nums.length>0 && nums[0]==nums[nums.length-1];
    }

}

package week14_January8Array;

public class FirstLast6 {
    public static void main(String[] args) {
        //Calling&Printing Method1
        int[] nums = {1,2,6};
        System.out.println(firstLast6(nums));

        //Calling&Printing Method2
        System.out.println(firstLast6(new int[]{1, 2, 6}));
    }
    public static boolean firstLast6(int[] nums) {
        // An array is a data structure that stores a fixed-size, sequential collection of elements of the same type. It is used to group related data items under a single name. Each element in the array is accessed by its index, which is an integer value starting from 0.
        //solution1
        // if (nums[0] == 6 || nums[nums.length-1] == 6)
        //   return true;
        // else return false;

        //solution2
        return (nums[0] == 6 || nums[nums.length-1] == 6);
    }

}

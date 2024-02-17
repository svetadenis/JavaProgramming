package week15_Arrays;

import java.util.Arrays;

public class ArraySwapper {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        swapEnds(array);
        System.out.println(Arrays.toString(array)); // Output: [4, 2, 3, 1]
    }

    public static void swapEnds(int[] nums) {
        if (nums.length >= 1) {
            int length = nums.length;
            int temp = nums[0];
            nums[0] = nums[length - 1];
            nums[length - 1] = temp;
        }
    }
}

/*

Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

   /* int[] array1 = {1, 2, 3, 4};
    int[] result1 = swapEnds(array1);
        System.out.println(Arrays.toString(result1)); // Output: [4, 2, 3, 1]

    int[] array2 = {1, 2, 3};
    int[] result2 = swapEnds(array2);
        System.out.println(Arrays.toString(result2)); // Output: [3, 2, 1]

    int[] array3 = {8, 6, 7, 9, 5};
    int[] result3 = swapEnds(array3);
        System.out.println(Arrays.toString(result3)); // Output: [5, 6, 7, 9, 8]
}

public static int[] swapEnds(int[] nums) {
    if (nums.length >= 1) {
        int temp;
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }
    return nums;
}
*/

/*int[] array1 = {1, 2, 3, 4};
int[] result1 = swapEnds(array1);
        System.out.println(Arrays.toString(result1)); // Output: [4, 2, 3, 1]

int[] array2 = {1, 2, 3};
int[] result2 = swapEnds(array2);
        System.out.println(Arrays.toString(result2)); // Output: [3, 2, 1]

int[] array3 = {8, 6, 7, 9, 5};
int[] result3 = swapEnds(array3);
        System.out.println(Arrays.toString(result3)); // Output: [5, 6, 7, 9, 8]
        }

public static int[] swapEnds(int[] nums) {
    return (nums.length >= 1) ? new int[]{nums[nums.length - 1], nums[1], nums[2], nums[0]} : nums;  */
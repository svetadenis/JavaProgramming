package week10_OfficeHours_Saturdays;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleOfMemory {
    public static void main(String[] args) {

        ArrayList<Integer> nums; // reference
        // Q: do I have an object here? NO
        // Q: is the value null? NO there is no value -> this is a local variable
        nums = new ArrayList<>(); // created a new ArrayList object, referenced by nums
        nums.addAll(Arrays.asList(4, 6, 23, 56));
        System.out.println(nums);

        ArrayList<Integer> other = nums; // Q: did we make an object NO. we are pointing to the same object that nums references
        nums.add(0);
        other.add(1);
        System.out.println(nums);
        System.out.println(other);

        ArrayList<Integer> java = new ArrayList<>(nums); // creating a new ArrayList object with the argument of another ArrayList which means we are creating a new object with the same elements
        java.add(9);
        System.out.println(nums);
        System.out.println(java);



    }
}
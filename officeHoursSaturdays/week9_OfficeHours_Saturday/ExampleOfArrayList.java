package week9_OfficeHours_Saturday;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleOfArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(); // an empty ArrayList
        System.out.println(nums);
        nums.add(4);
        nums.add(7);
        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>(nums); // create the ArrayList with the same elements - copies it
        nums.add(8);
        nums2.add(1);
        System.out.println(nums);
        System.out.println(nums2);

        int [] a = {5, 1, 235};
        first(a);
        second(a);
        second(6, 2, 5, 6);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 1, 5, 9, 21));
        System.out.println(list);
        list.remove(4); // this removes the index 4 because we called the remove\ method with int argument
        System.out.println(list);
        Integer n = 2;
        list.remove(n); // this removes the value 2 because we called the remove method with object argument
        System.out.println(list);


    }

    public static void first(int[] arr){
        System.out.println(arr[0]);
    }

    public static void second(int... arr){ // var arg (...) -> this is still an array, but it lets you type the elements
        System.out.println(arr[1]);
    }
}
package week10_OfficeHours_Saturdays;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 32, 6, 3, 5, 1, 23, 5));
        // option 1: give an ArrayList
        ArrayList<Integer> toAdd = new ArrayList<>(Arrays.asList(4, 5, 12));
        list.addAll(toAdd);
        System.out.println(list);

        // option 2: give an ArrayList, through the Arrays.asList method
        list.addAll(Arrays.asList(90, 30, 100, 499));
        System.out.println(list);

        System.out.println(list.containsAll(Arrays.asList(32, 90, 5)));
        System.out.println(list.containsAll(Arrays.asList(32, 90, 7)));


    }
}
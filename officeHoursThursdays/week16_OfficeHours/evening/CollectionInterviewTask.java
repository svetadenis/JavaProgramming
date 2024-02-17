package week16_OfficeHours.evening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionInterviewTask {
    // write a program that can move all the zeros to the end of the List of integers
    public static void main(String[] args) {
        List list = new ArrayList(Arrays.asList(3, 0, -5, -6, 7, 0, 1, -7, 0, 4, 4, 5, 0, 7, 0));
        //  Collections.sort(list); zeros are at the middle
        System.out.println("list = " + list.size()); // 12
        int previousSize = list.size();

        list.removeAll((Arrays.asList(0)));
        System.out.println(list.size()); // 9
        int afterSize = list.size();


        // I know how many zeros I have, and I removed them

        // then we are adding at the end
        for (int i = 0; i < previousSize - afterSize; i++) {
            list.add(0);
        }

        System.out.println("list = " + list);

    }

}
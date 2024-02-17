package week11_OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondBiggestNumber {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,1,4,5,2,4,8,4,8));
        System.out.println(secondMax(list));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 3, 4, 10, 8, 11, 3));
        System.out.println(secondMax(list2));
    }

    public static int secondMax(ArrayList<Integer> list){ //6, 3, 4, 10, 8, 11, 3
        int max = list.get(0); //11
        int secondMax = Integer.MIN_VALUE; //10
        for(int each : list){
            if(each > max){
                secondMax = max;
                max = each;
            } else if(each > secondMax && each != max){
                secondMax = each;
            }
        }
        return secondMax;
    }
}
/*
[IQ] Second Biggest Number [ArrayList, loop, conditional]

    Create a program that will have an ArrayList of Integers. Find the second biggest number in the list.
    Note: the 2nd biggest should be unique meaning it should be different from the max number

Example:
    Input:
        [4,3,1,4,5,2,4,8,4,8]
    Output:
        5
 */
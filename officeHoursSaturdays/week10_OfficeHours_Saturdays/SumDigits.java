package week10_OfficeHours_Saturdays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "52", "513"));
        System.out.println(sumOfDigits(list));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("1111", "912", "554", "1258"));
        System.out.println(sumOfDigits(list2));
    }

    public static ArrayList<Integer> sumOfDigits(ArrayList<String> list){
        ArrayList<Integer> sum = new ArrayList<>();
        for(String each : list){
            int eachSum = 0;
            for(String eachDigit : each.split("")){
                eachSum += Integer.parseInt(eachDigit);
            }
            sum.add(eachSum);
        }
        return sum;
    }

}
/*
SumDigits [Wrapper class, ArrayList, loop]

    Create a program that will define an ArrayList of String. The elements in this ArrayList will be number digits like: "123". Calculate the sum of the digits and store them into a new ArrayList of Integers. Print all the sums of the digits at the end.

        Ex:
            Input:
            ["123, "52", "513"]
            Output:
            [6, 7, 9]
 */
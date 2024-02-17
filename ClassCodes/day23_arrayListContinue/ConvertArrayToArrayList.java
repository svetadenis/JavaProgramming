package day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {

   String [] arr = {"A","B","C","D"};
   ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
    System.out.println(list);//[A, B, C, D]

    System.out.println("_______________________________________________");

    ArrayList<String>list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));
    String[] languages = list2.toArray(new String[10]);
    System.out.println(Arrays.toString(languages));//[Java, Python, C#, null, null, null, null, null, null, null]

    System.out.println("_____________________________________________");

    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
   Integer[] n = nums.toArray(new Integer[0]);
 //   int[] n = nums.toArray(new Integer[0]);
    System.out.println(Arrays.toString(n));//[1, 2, 3, 4, 5, 6, 7]

        System.out.println("_________________________________________________");



    }
}

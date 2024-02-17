package day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensional {
    public static void main(String[] args) {

    int[] arr1D = new int[10];
    System.out.println(Arrays.toString(arr1D));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = {6,7,8};
    int[] arr3 = {9,10};
    int[] arr4 = {11,12,13,14,15};
    int[] arr5 = {16,17,18,19,20};


    int[][] arr2D = new int[5][];//5 one dimensinal arrays
    System.out.println(Arrays.toString(arr2D));//index 0~4   [null, null, null, null, null]

        arr2D[0] = arr1D;
    System.out.println(Arrays.deepToString(arr2D));//[[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], null, null, null, null]
//                                                         instead of one null

        arr2D[0] = arr1;//[o],[1],[2],[3],[4] - indexes of arrays
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

    System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3, 4, 5], [6, 7, 8], [9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20]]

// int[] arr6 = {30,40,50,60,70,80,90};
   // arr2D[5] = arr6; mistake. the size of the 2D array is fixed. can't accept arr6 in a five one dimentional arrays


    }
}

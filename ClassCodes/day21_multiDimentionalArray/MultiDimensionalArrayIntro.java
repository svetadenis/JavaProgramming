package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
//index numbers of elements 0  1 3    0  1   2  3  4   0   1
        int[][] arr2D = { {10,20,30},{40,50,60,70,80},{90,100} };//3 single dimentional's arrays
    //index of single arrays:   0           1              2

        System.out.println(arr2D.length);//3

        System.out.println(Arrays.toString(arr2D[1]));//[40, 50, 60, 70, 80]
        System.out.println(Arrays.toString(arr2D[2]));//[90, 100]
        System.out.println(Arrays.toString(arr2D[0]));//[10, 20, 30]

        System.out.println(arr2D[2][0]);//90
        System.out.println(arr2D[1][2]);//60


        System.out.println("____________________________________________________________");


        int[] array1 = {10,20,30};
        int[] array2 = {40,50,60,70,80};
        int[] array3 = {90,100};
        int[] array4 = {1000,2000};

        int[][] array2D = { {10,20,30},{40,50,60,70,80},{90,100},array4 };//4 single dimentional arrays
        System.out.println(array2D.length);//4

        System.out.println("____________________________________________________________");


    }
}

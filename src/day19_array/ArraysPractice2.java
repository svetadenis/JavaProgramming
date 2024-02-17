package day19_array;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        int[] arr1 = new int[100];
        System.out.println("arr1 = " + Arrays.toString(arr1)); //100 zirous
        //soutv  - shortcut to print variable
        
        //arr1.fori     short cut for loop
        for (int i = 0, j=1; i < arr1.length; i++,j++) {
            arr1[i]=j;
        }
//int i = 0, j = 1;: Initializes two variables, i and j.
// i will be used as the index for the array, and j will be used to assign values to the array elements.
// i starts at 0, and j starts at 1.
        System.out.println("arr1 = " + Arrays.toString(arr1));//from 1 to 100

        int[] arr2 = new int[100];
        for (int i = 0, j = 100; i <arr2.length; i++,j--) {
        arr2[i] = j;
        }
        System.out.println("arr2 = " +Arrays.toString(arr2));//[100,99,98,..1]

//i is index of loop. it starts from 0 and goes to 99.
// j is the value assigned to each statement in the array. it starts from 1 and goes up to 100

    }
}

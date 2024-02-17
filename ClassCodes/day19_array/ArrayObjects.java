package day19_array;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};//in a heap memory
        int[] arr2 = arr1;//one object, will be sharing to multiple variables
        int[] arr3 = arr2;

        arr1[0] = 1000;//the first elements will be changed from 10 to 1000
        arr2[2] = 3000;//30 will be changed to 3000 from 30

        System.out.println(Arrays.toString(arr1));//[10,20,30,40,50]
        System.out.println(Arrays.toString(arr2));//[10,20,30,40,50]
        System.out.println(Arrays.toString(arr3));//[10,20,30,40,50]

        System.out.println("__________________________________________");
        
    String[] a1 = {"Sveta", "Vika"};
    a1 = new String[]{"Daniel","James"};
        System.out.println(Arrays.toString(a1));//Daniel, James
    }
}

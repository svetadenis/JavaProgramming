package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

     int[] array = {1,2,3,4,5};//you can't change the size of this array
     int element = 6;//tp add more elements in an array we need to create a new array

    int[] new_array = Arrays.copyOf(array, array.length+1);
     //{1,2,3,4,5}
    System.out.println(Arrays.toString(new_array));//[1, 2, 3, 4, 5, 0]

    new_array[new_array.length-1] = element;//  we assigned element 6 in a last position of a new array
    System.out.println(Arrays.toString(new_array));//[1, 2, 3, 4, 5, 6]

    System.out.println("_______________________________________________________________");


        int[] numbers = {100,90,80,70,60};
        numbers=  ArraysUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));//[100, 90, 80, 70, 60,50]

    System.out.println("___________________________________________________________");

    double[] nums = {1.5,2.5,3.5,4.5};
    nums=ArraysUtility.addElement(nums, 5.5);
    System.out.println(Arrays.toString(nums));//[1.5, 2.5, 3.5, 4.5, 5.5]

    //the size of array will be the same. we just add one more element
    System.out.println("___________________________________________________________");

    String[] names = {"Yasir","Sveta","Vika"};
    names= ArraysUtility.addElement(names,"Klava");
    System.out.println(Arrays.toString(names));//[Yasir, Sveta, Vika, Klava]
    names= ArraysUtility.addElement(names,"Moisha");
    System.out.println(Arrays.toString(names));//[Yasir, Sveta, Vika, Klava, Moisha]




    }
}

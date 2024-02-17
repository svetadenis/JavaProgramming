package day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] array = new int[5];//{0,0,0,0,0}
        array[0] = 10;//{10.0,0,0,0}
        array[1] = 20;//[10,20,0,0,0]
        System.out.println(Arrays.toString(array));
        array[2] = 30;//{10,20,30,0,0}
        array[3] = 40;//{10,20,30,40,0}
        array[4] = 50;//{10,20,30,40,50}
        System.out.println(Arrays.toString(array));

        //array[5] = 60; doesn't work,because size of array is 5 elements or 4 indexes

        System.out.println("_____________________________________________");

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());//0


        }}


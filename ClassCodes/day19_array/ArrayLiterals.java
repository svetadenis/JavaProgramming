package day19_array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {
        int[] numbers = new int [5];//if we don't know the exact numbers
        int[] nums = {10,20,30,40,50};//if we know the exact numbers

        System.out.println(numbers.length);//the same size 5
        System.out.println(nums.length);//the same size 5

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        System.out.println("________________________________________________");

//   element:           1         2         3         4         5          6         7
    String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday" };
    //index               0       1         2         3         4         5         6
    int n = 1;//prints day with index 0; it's Monday
    System.out.println(days[n-1]);

        System.out.println("________________________________________________");

    String []  month = {"Jan", "Feb","Mar","April","May","June","July","August","September","October","November","December"};
    System.out.println("month = "+Arrays.toString(month));
    /*
    month = new String[12];
    month[0]="Jan"
    ....
     */

        System.out.println("__________________________________________");

    int[] numbers2 = {1,2,3,4,5,6,7};
        System.out.println("number = "+Arrays.toString(numbers2));//1,2,3,4,5,6,7

        System.out.println("__________________________________________");

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);

            for (int i1 = 0; i1 < month.length; i1++) {
                
            }
        }

        }

    
    }


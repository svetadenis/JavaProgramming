package Day20_arraysContinue;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

       int[] array = {1,2,3,4,5};
        int [] reverse = new int [array.length];//{5,4,3,2,1}

        for(int i = array.length - 1, j=0;i>=0;i--,j++){

            reverse[j] = array[i];
        }
        System.out.println(Arrays.toString(reverse));//{5,4,3,2,1}

        //or second option



/*int[] array = {1,2,3,4,5,6,7};
int[] reverse = new int[array.length];

        for (int i = array.length-1, j =0 ; i>=0; i--) {
            reverse [j++]=array[i];

        }
        System.out.println(Arrays.toString(reverse));*/

System.out.println("___________________________________________");


int[] nums = {100,200,300,400,500};
nums= ArraysUtility.reverse(nums);

System.out.println(Arrays.toString(nums));

    System.out.println("_________________________________________");//[500, 400, 300, 200, 100]

    double[] a1 = {1.5, 2.5, 3.5,4.5,5.5};
    a1=ArraysUtility.reverse(a1);
    System.out.println(Arrays.toString(a1));//[5.5, 4.5, 3.5, 2.5, 1.5]



    }
}

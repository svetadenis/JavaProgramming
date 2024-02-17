package Day20_arraysContinue;

import java.util.Arrays;
import utilities.ArraysUtility;//from class ArraysUtility

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length];// to make sure that 3rd array has capacity to contain all the
        //elements of r1 and r2

        int k = 0;//for third array index numbers

        for (int i = 0; i < arr1.length; i++,k++) {//i:for first array's index numbers
        arr3[k]=arr1[i];
        }
        //System.out.println(Arrays.toString(arr3));//[1,2,3,4,0,0,0]

        for (int i = 0; i < arr2.length; i++,k++) {//i: for second array's index numbers
        arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 5, 6, 7]


        System.out.println("__________________________________________");

    int[] a1 = {10,20,30,40,50};
    int[] a2 = {70,80,90};

    int[] a3 = ArraysUtility.merge(a1,a2);//call merge method from ArraysUtility class
        System.out.println(Arrays.toString(a3));//[10, 20, 30, 40, 50, 70, 80, 90]

        System.out.println("____________________________________________");

    double[] b1 = {10.5,5.5,3.5,6.5,8.5};
    double[] b2 = {20.5,15.5,13.5};

   // double[] b3 = ArraysUtility.merge(b1,b2);//we can't assign this method to double variables
        //because our method is integer (see ArraysUtility line 4
        //we have to creat anothe method
    double[] b3 = ArraysUtility.merge(b1,b2);
    System.out.println(Arrays.toString(b3));//[10.5, 5.5, 3.5, 6.5, 8.5, 20.5, 15.5, 13.5]

    System.out.println("___________________________________________");

    char[] ch1 = {'A','b','c','D','e'};
    char[] ch2 = {'X','Y','Z'};

   char[] ch3 = ArraysUtility.merge(ch1,ch2);
    System.out.println(Arrays.toString(ch3));//[A, b, c, D, e, X, Y, Z]

    System.out.println("_____________________________________");

    String[] c1 = {"Java","Python","JavaScript","Ruby"};
    String[] c2 = {"C++","C#+"};

   String[] c3 = ArraysUtility.merge(c1,c2);
    System.out.println(Arrays.toString(c3));//[Java, Python, JavaScript, Ruby, C++, C#+]






    }
}




/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */
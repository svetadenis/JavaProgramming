package day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimentionalArray {
    public static void main(String[] args) {
//index of elements:       0 1  2    0   1  2  3  4    0   1
        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}};
    //index of 1D array:     0              1            2

        for (int i = 0; i < arr2D.length; i++) {//3 is total numbers of dimentional errays in 2D array
    //i is index number of one dimentional array
     //  System.out.println(Arrays.toString(arr2D[i]));
    //[10, 20, 30]
    //[40, 50, 60, 70, 80]
    //[90, 100]
        int[] each1D = arr2D[i];
        System.out.println(Arrays.toString(each1D));

        for(int j=0;j<each1D.length;j++){ //j: index number of elements in each 1D array of arr2D
        int eachElement = each1D[j];
        System.out.println(eachElement);
        }
        }
/*
[10, 20, 30]
10
20
30
[40, 50, 60, 70, 80]
40
50
60
70
80
[90, 100]
90
100
 */
System.out.println("________________________________________________________");
    //FOR EACH LOOP

    for(int[] each1DArray:arr2D){
    System.out.println(Arrays.toString(each1DArray));

    for(int eachElement:each1DArray){
    System.out.println(eachElement);
/*
[10, 20, 30]
10
20
30
[40, 50, 60, 70, 80]
40
50
60
70
80
[90, 100]
90
100
 */
        }
}
System.out.println("_________________________________________________");
/*
index of elements:       0 1  2    0   1  2  3  4    0   1
        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}};
index of 1D array:         0              1            2
 */


    for(int i = arr2D.length-1;i>=0;i--){
        for (int j = arr2D[i].length-1;j>=0;j--){
            System.out.println(arr2D[i][j]);//100 90 80 70 60 50 40 30 20 10

        }
    }
    System.out.println("______________________________________________");

    for(int[] each1DArray:arr2D){
        for(int eachElement:each1DArray){
            System.out.println(eachElement);//10 20 30 40 50 60 7y0 80 90 100
        }
    }


    }
}

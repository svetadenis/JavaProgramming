package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

    int[][] arr2D1 = {{1,2},{3,4,5}};
    int[][] arr2D2 = {{6,7,8,9},{10,11},{12,13,14}};
    int[][] arr2D3 = {{15,16,17,18}};

    int[][][] arr3D = {  {{1,2},{3,4,5}},    {{6,7,8,9},{10,11},{12,13,14}},   {{15,16,17,18}}   };
   //                        arr2D1                       arr2D2                    arr2D3
    //[index of 2d array][index of 1d array][index of elements]
    // index 2D arrays:          0                             1                     2
    // index 1D array:      0       1            0         1         2                0

        System.out.println(Arrays.deepToString(arr3D));//[[[1, 2], [3, 4, 5]], [[6, 7, 8, 9], [10, 11], [12, 13, 14]], [[15, 16, 17, 18]]]
        System.out.println(Arrays.deepToString(arr3D[1]));//[[6, 7, 8, 9], [10, 11], [12, 13, 14]]

        System.out.println(Arrays.toString(arr3D[0][1]));//[3, 4, 5]
        System.out.println(Arrays.toString(arr3D[1][0]));//[6, 7, 8, 9]

        System.out.println(arr3D[1][2][2]);//14
//index of 2D array, index of 1D array, index of element
        System.out.println(arr3D[2][0][2]);//17

    System.out.println("__________________________________________________________");

//in order to get in element in a 3D array we have to get 2D array, single array and then index of element

        for (int i = 0; i < arr3D.length; i++) {//i:index of number of each 2 dimensional array
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

        /*
[[1, 2], [3, 4, 5]]
[[6, 7, 8, 9], [10, 11], [12, 13, 14]]
[[15, 16, 17, 18]]
         */
        for (int j = 0; j < each2DArray.length; j++) {//j: index number of each 1 dimentional array
        int[] each1DArray = each2DArray[j];
        System.out.println(Arrays.toString(each1DArray));
/*
[[1, 2], [3, 4, 5]]
[1, 2]
[3, 4, 5]
[[6, 7, 8, 9], [10, 11], [12, 13, 14]]
[6, 7, 8, 9]
[10, 11]
[12, 13, 14]
[[15, 16, 17, 18]]
[15, 16, 17, 18]
 */
        for (int k = 0; k < each1DArray.length; k++) {//k: index number of each element contained in 1D array
        int eachElement = each1DArray[k];
        System.out.println(eachElement);
/*
[[1, 2], [3, 4, 5]]
[1, 2]
1
2
[3, 4, 5]
3
4
5
[[6, 7, 8, 9], [10, 11], [12, 13, 14]]
[6, 7, 8, 9]
6
7
8
9
[10, 11]
10
11
[12, 13, 14]
12
13
14
[[15, 16, 17, 18]]
[15, 16, 17, 18]
15
16
17
18
 */


            }
        }}






    }
}

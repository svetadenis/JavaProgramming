package day21_multiDimentionalArray;

public class MultiDemensionalArrayPractice3 {
    public static void main(String[] args) {

        int[][][] arr3D1 = {{{1, 2},{3, 4, 5}},   {{6, 7, 8, 9},{10, 11},{12, 13, 14}},   {{15, 16, 17, 18}}  };
        //                        arr2D1                           arr2D2                            arr2D3
        //[index of 2d array][index of 1d array][index of elements]
        // index 2D arrays:          0                             1                                 2
        // index 1D array:      0       1            0              1             2                  0

        int[][][] arr3D2 = {{{1, 2}, {3, 4, 5}},   {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}},   {{15, 16, 17, 18}}};
        int[][][] arr3D3 = {{{1, 2}, {3, 4, 5}},   {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}},    {{15, 16, 17, 18}}};

        int[][][][] arr4D = { arr3D1,arr3D2,arr3D3};

   for(int[][][] each3D:arr4D){
       for(int[][] each2D:each3D) {
           for (int[] each1D : each2D) {
               for (int eachElement : each1D) {
                   System.out.print(eachElement+" ");//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
      //3 times from 1 to 18
       }

        }
    }
}}}

package week10_OfficeHours;
import java.util.Arrays;
public class T1MultiplyMatrix {

   /* T1MultiplyMatrix [multidimensional array]

    Create a program that will take two given 2D int array that have the same number of elements and multiply the matrices together. Each number is multiplied with each other number in the same position
    Print the result as a separate 2D array

    Ex: array 1                 array 2
            [[1, 2, 3], [5, 2, 1]] * [[25, 3, 5], [0, 1, 19]]
    result:
            [[25, 6, 15], [0, 2, 19]]
            */

    public static int[][] multiplyMatrix(int[][] first, int[][] second) {

        int[][] result = new int[first.length][first[0].length]; // [ [0, 0, 0] , [] ]

        for (int i = 0; i < first.length; i++) { // this loop iterates through the 2D array
            for (int j = 0; j < first[i].length; j++) { // this loop iterates through the 1D array
                result[i][j] = first[i][j] * second[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] first = {
                {1, 2, 3},
                {5, 2, 1},
        };

        int[][] second = {
                {25, 3, 5},
                {0, 1, 19}
        };

        System.out.println(Arrays.deepToString(multiplyMatrix(first, second)));

        int[][] third = {
                {63, 12, 6, 16, 2},
                {63, 12, 6, 16, 2},
                {63, 12, 6, 16, 2},
                {63, 12, 6, 16, 2},
        };

        int[][] fourth = {
                {42, 5, 12, 5, 2},
                {42, 5, 12, 5, 2},
                {42, 5, 12, 5, 2},
                {42, 5, 12, 5, 2},
        };

        int[][] result = new int[4][5];
    }


}


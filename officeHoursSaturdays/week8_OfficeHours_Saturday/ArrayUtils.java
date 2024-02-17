package week8_OfficeHours_Saturday;

import java.util.Arrays;
public class ArrayUtils {
    public static int indexOf(int[] arr, int element){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }

        return -1; // if this runs the element was not found int the array
    }

    /*
       this method will add elements to an array by creating an array with one more size
     */
    public static int[] addTo(int[] arr, int newElement){
        int[] newArr = new int[arr.length + 1]; // one size bigger than old array
        // copy all of the old elements into the new array
        for(int i = 0 ; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = newElement; // assigns the newElement to the last index of the new array

        return newArr;
    }

    public static int[] addTo2(int[] arr, int newElement){
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = newElement;
        return newArr;
    }

    public static int[] subArray(int[] arr, int start, int end){
        int[] subArr = new int[end - start];

        for(int i = 0; i < subArr.length; i++){ // i will be the index for assigning into the subArr
            subArr[i] = arr[start++]; // start variable is the index for reading from the original array
        }
        return subArr;
    }

    public static int[] subArray2(int[] arr, int start, int end){
        int[] subArr = new int[end - start];

        for(int i = 0, j = start; i < subArr.length; i++, j++){
            subArr[i] = arr[j];
        }
        return subArr;
    }
    /*
     subArray({3, 4, 1, 5, 6, 5}, 2, 5) -> {1, 5, 6}
        {3, 4, 1, 5, 6, 5}
        start = 4
        [1, 5, 6]
     */

}

/*
ArrayUtils [array, loop, method]

    Create these two utility methods for array objects

    indexOf(int[] arr, int element)
        create a method that will search for and return the index of the given element in the array.
            if there is multiple of that element return the first occurrence
            if the element does not exist return -1

        Ex:
            indexOf({3, 4, 1, 5, 6, 5}, 5) -> 3
            indexOf({3, 4, 1, 5, 6, 5}, 7) -> -1
            indexOf({3, 4, 1, 5, 6, 5}, 3) -> 0

    subArray(int[] arr, int start, int end)
        create a method that will return part of the array back. The part of sub-array will be based on the start the end indexes. The end index is not included

        Ex:
          subArray({3, 4, 1, 5, 6, 5}, 0, 3) -> {3, 4, 1}
          subArray({3, 4, 1, 5, 6, 5}, 2, 5) -> {1, 5, 6}
          subArray({3, 4, 1, 5, 6, 5}, 1, 6) -> {4, 1, 5, 6, 5}

 */


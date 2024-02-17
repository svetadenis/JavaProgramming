package week9OfficeHours;
import java.util.Arrays;
public class T4ShiftLeft {
    public static void main(String[] args) {

        int[] arr =  {17, 14, 5, 10}; // 14, 5, 10, 17
        int firstElm = arr[0]; // 17

        for(int i = 1; i < arr.length; i++){ // this loop reads the values and assigns that value into the previous index
            arr[i - 1] = arr[i]; // i - 1 is the previous index
        }

        arr[arr.length - 1] = firstElm; // assigns the last index to be the original first value

        System.out.println(Arrays.toString(arr));

    }
}

/*
T4ShiftLeft [array, loop]

    Create a program that will define an int array with any number of elements. Print out the array with all the elements shifted one position to the left. The first element would be moved to the end

    Create a program that will define an int array with any number of elements. Print out the array with all the elements shifted one position to the left. The first element would be moved to the end

    Ex:
        {1, 2, 3} -> [2, 3, 1]
        {17, 14, 5, 10} -> [14, 5, 10, 17]
        {7, 0, 1} -> [0, 1, 7]
 */


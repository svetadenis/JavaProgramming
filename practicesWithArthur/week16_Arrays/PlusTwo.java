package week16_Arrays;

import java.util.Arrays;

public class PlusTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusTwo(new int[]{1,2}, new int[]{3,4})));
    }

    public static int[] plusTwo(int[] a, int[] b) {



        //solution1 with new array
        // int[] myArray = new int[4];
        // myArray[0] = a[0];
        // myArray[1] = a[1];
        // myArray[2] = b[0];
        // myArray[3] = b[1];

        //return myArray;

        //solution2 array literal
        // int [] myArray = {a[0],a[1],b[0],b[1]};
        // return myArray;

        //solution3 direct return one line
        //return new int []{a[0],a[1],b[0],b[1]};

        //solution4 if we dont know length of arrays
//   int[] myArray = new int[a.length + b.length];
//   int i = 0; //we need to declare this int outside of loop for using it
//             //also second loop with the value of cumulatively decreasing value
//   for(; i < a.length; i++) {
//     myArray[i] = a[i];
//     }
//   for(; i < b.length + a.length; i++) {  //myArray.length
//     myArray[i] = b[i - a.length];
//     }
// return myArray;

        //solution5 (while loop)
//   int[] myArray = new int[a.length + b.length];
//   int i = 0;

//   while( i < a.length) {
//     myArray[i] = a[i];
//     i++;
//     }
//   while(i < b.length + a.length) {  //myArray.length
//     myArray[i] = b[i - a.length];
//     i++;
//     }
// return myArray;

//solution6(creating two different int)
        int [] myArray = new int [a.length + b.length];
        int k = 0;
        for(int i = 0; i <a.length; i++, k++ ){
            myArray[k] = a[i];
        }
        for(int i = 0; i<b.length; i++, k++){
            myArray[k] = b[i];
        }
        return myArray;


    }

}

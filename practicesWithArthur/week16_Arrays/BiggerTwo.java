package week16_Arrays;

import java.util.Arrays;

public class BiggerTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(biggerTwo(new int[]{1,2}, new int[]{3,4})));
    }
    public static int[] biggerTwo(int[] a, int[] b) {

        //solution1
        // int aSum = a[0] + a[1];
        // int bSum = b[0] + b[1];

        // if (aSum == bSum){
        //   return a;
        // }else if (aSum > bSum){
        //   return a;
        // }else{
        //   return b;}

        //solution2(Merge = and > conditions)
//   int aSum = a[0] + a[1];
//   int bSum = b[0] + b[1];

// if (aSum >= bSum){
//     return a;
//   }else{
//     return b;}

        //solution3(remove curly braces)
//   int aSum = a[0] + a[1];
//   int bSum = b[0] + b[1];

// if (aSum >= bSum)
//     return a;
//   else
//     return b;

        //solution4(remove else keyword)
//   int aSum = a[0] + a[1];
//   int bSum = b[0] + b[1];

// if (aSum >= bSum)
//     return a;
//     return b;

        //solution5(one line direct return with ternaries)
        return a[0]+a[1] >= b[0]+b[1] ? a : b ;
    }


}
package week09_December04;

public class In1to10 {
    public static void main(String[] args) {
        System.out.println(in1To10(22, true));
    }
    public static boolean in1To10(int n, boolean outsideMode) {

        // Solution 1 (too long)
        // if (outsideMode){

        // if (n <= 1 || n >= 10) {
        //     return true;
        //   } else {
        //       return false;
        //     }
        // } else {
        //     if (n >= 1 && n <= 10) {
        //       return true;
        //     } else {
        //         return false;
        //       }
        //   }

        //solution2(3 steps)
        //Step 1 (we have one red)
        //return (n >= 1 && n <= 10) || outsideMode  ;


        //Step 2 (still we have one red)
        //return (  (!outsideMode) && (n >= 1 && n <= 10) )|| outsideMode   ;

        // Step 3
        //return  (!outsideMode) && (n>=1 && n<=10)  ||  (outsideMode) && (n<=1 || n>=10) ;

        //solution3
        return  outsideMode ? n<=1 || n>=10 : n>=1 && n<=10;


    }

}


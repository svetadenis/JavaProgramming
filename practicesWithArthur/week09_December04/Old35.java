package week09_December04;

public class Old35 {
    public static void main(String[] args) {
         System.out.println(old35(45));
}
    public static boolean old35(int n) {
        // Solution1
        //return (n%5==0 || n%3==0) && !(n%5==0 && n%3==0) ;

        // Solution2
        //What is the meaning of the number which is multiple of both 3 and 5 at the same time:
        //That means multiple of 15.

        //return (n%5==0 || n%3==0) && n%15 !=0 ;




        //If I say n%5==0 && n%3==0 --> it will not cover any number

        // Solution3(one of them needs to be false while the other one is true)
        return (n % 3 == 0) != (n % 5 == 0);

        // Solution4
        //return n % 5 == 0 ^ n % 3 == 0;

        // You can also use the ^ XOR (exclusive OR) operator on boolean values in Java.
        // In this case, the operator behaves as a logical XOR,
        // returning true if exactly one of the operands is true, and the other one false.


    }

}

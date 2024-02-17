package week11_December18th.String1;

public class NTwice {
    public static void main(String[] args) {
        System.out.println(nTwice("Arthur", 2));
    }
    public static String nTwice(String str, int n) {

        //solution1
        //think about that n=1 so:
        //return str.substring(0,1)+str.substring(str.length()-1);
        //and then just change 1 with n
        //return str.substring(0,n)+str.substring(str.length()-n);

        //solution2(concat method)
        return str.substring(0,n).concat(str.substring(str.length()-n));
    }

}


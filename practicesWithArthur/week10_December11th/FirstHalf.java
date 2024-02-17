package week10_December11th;

public class FirstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("abcdefg"));
    }
    public static String firstHalf(String str) {

        //solution1 (for even)
        //return str.substring(0,str.length()/2);

        //solution2(for odd and
        //          you would like to INCLUDE middle character of string)
        //return str.substring(0,str.length()/2+1);

        //solution3 (for both even and odd, if it is odd;
        //             you would like to INCLUDE middle character of string)
        return str.length()%2==0 ? str.substring(0,str.length()/2) :
                str.substring(0,str.length()/2+1);

    }
    }


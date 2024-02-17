package week09_December04;

public class Less20 {
    public static void main(String[] args) {

        System.out.println(less20(19));
    }
    public static boolean less20(int n) {

        //Solution1
        return n%20==18 || n%20==19;
        //Solution2
        //return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }
}



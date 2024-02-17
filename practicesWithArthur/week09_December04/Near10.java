package week09_December04;

public class Near10 {
    public static void main(String[] args) {
        System.out.println(nearTen(-11));
    }

    public static boolean nearTen(int num) {

        //Solution1
        // if (num%10==2 || num%10==1 || num%10==0 || num%10==9 ||num%10==8)
        //   return true;
        // else return false;


        //Solution2
        //return num%10==2 || num%10==1 || num%10==0 || num%10==9 ||num%10==8;

        //Solution3(does not meet the non-negative number condition.)
        //return num % 10 <= 2 || num % 10 >=8;

        //Solution4(shortest)
        return (num+2)%10<5;
    }

}


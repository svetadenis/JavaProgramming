package week09_December04;

public class TeenSum {
        public static void main(String[] args) {

            System.out.println(teenSum(6, 14));
        }
        public static int teenSum(int a, int b) {
            //Solution1
            //if (a>=13 && a<=19 || b>=13 && b<=19){
            //  return 19;
            //}else return a+b;

            //Solution2(Can you guys write this regular if with ternaries?)
            return ((a>=13 && a<=19 || b>=13 && b<=19)? 19 : a + b);
        }
    }


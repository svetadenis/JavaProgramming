package week6_OfficeHours_Saturday;
import java.util.Scanner;
public class cube {



        public static int cube(){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            //TYPE YOUR CODE BELOW:

            sc.close();
            int cube;
            cube=n*n*n;
            return cube;

        }

        public static void main(String[] args) {

            int c = cube();
            System.out.println(c);



        }




}

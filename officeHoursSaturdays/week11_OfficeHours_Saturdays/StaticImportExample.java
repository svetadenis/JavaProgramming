package week11_OfficeHours_Saturdays;


import java.lang.*;
import static java.lang.Math.*;
import static java.lang.Integer.MAX_VALUE;

        public class StaticImportExample {
        public static void main(String[] args) {

            System.out.println(Integer.MAX_VALUE);
            System.out.println(Math.PI);

            // with static imports you don't need to give the class name
            System.out.println(MAX_VALUE);
            System.out.println(PI);

            // Assert.assertEquals()
            // we can assume Assert is a class and here we are calling a static method assertEquals()
            // import static package.Assert.*
            // now you could call the method like this: assertEquals()

        }
}

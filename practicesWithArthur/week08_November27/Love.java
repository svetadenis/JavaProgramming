package week08_November27;

public class Love {
    public static void main(String[] args) {
        System.out.println(love6(1, 5));
    }

    public static boolean love6(int a, int b) {

        //Solution1
        return a==6 || b==6 ||a+b==6 ||a-b==6 ||b-a==6 ;
        //a+b --> b+a the same
        //but a-b is not the same b-a --> -(a-b)== b-a
        //We are looking for if the a-b or b-a is negative number -->Math.abs() Method


        //Solution2
        //return a==6 || b==6 ||a+b==6 || Math.abs(a-b)==6;

    }


// --Math.abs()
//         Absolute value refers to the positive value corresponding to the number
//         passed as in arguments. No matter what be it positive or
//         negative number been passed for computation,
//         the computation will occur over the positive corresponding number in both cases.
//         So in order to compute the absolute value for any number we do have a specified
//         method in Java referred to as abs() present inside Math class present
//         inside java.lang package. The java.lang.Math.abs() returns the absolute
//         value of a given argument:
//             If the argument is not negative, the argument is returned.
//             If the argument is negative, the negation of the argument is returned.
}


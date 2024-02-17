package week14_OfficeHours_Saturdays;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9474));
        System.out.println(isArmstrong(9475));
        System.out.println(isArmstrong(123));
    }

    public static boolean isArmstrong(int n){ // 153
        String strNum = String.valueOf(n); // convert the int to a String
        int numOfDigits = strNum.length();
        int sum = 0;

        for(int i = 0; i < numOfDigits; i++){
            int eachDigit = Integer.parseInt(strNum.substring(i , i + 1)); // this code does the same as charAt(i), but it returns String
            sum += Math.pow(eachDigit, numOfDigits); // n ^ pow
//            int result = 1;
//            for(int j = 0; j < numOfDigits; j++){
//                result *= eachDigit;
//            }
        }
        System.out.println("DEBUGGING: " + sum);
        return sum == n;
    }
}

/*
    Create a method to check if a number is an Armstrong number
        parameter: int
        return: boolean

    An Armstrong number is a number that's digits can be raised to the power of the total number of digits and summed to equal the original number
        -> these numbers are also called narcissistic numbers

        Ex:
            input: 153
            output: true

            the digits are 1, 5, and 3
            the calculation would be:
            1^3 + 5^3 + 3^3
                -> why is the exponent 3? because there is 3 digits in the number

            1^3 = 1 * 1 * 1 = 1
            5^3 = 5 * 5 * 5 = 125
            3^3 = 3 * 3 * 3 = 27

            1 + 125 + 27 = 153 --> the sum is equal to the original number so it is an Armstrong number

        Test data:
            153 -> true
            371 -> true
            9474 -> true
            9475 -> false
            123 -> false
 */
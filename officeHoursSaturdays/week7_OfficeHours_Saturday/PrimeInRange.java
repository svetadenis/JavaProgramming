package week7_OfficeHours_Saturday;

public class PrimeInRange {
    public static void main(String[] args) {

        int num = 50; // ending point

        for(int i = 2; i <= num; i++){ // this loop goes through every number from 2 - ending (num)
            boolean isPrime = true; // in the outer loop, it is reset everytime the outer loop iterates

            for(int j = 2; j < i; j++){
                //System.out.println("i % j " + i + " " + j + " " + (i % j));

                if(i % j == 0){ // the number was divisible by another number that was not 1 or itself
                    isPrime = false;
                    break; // stops the inner loop
                }

            } // inner loop stops here

            if(isPrime){
                System.out.println(i);
            }

        }

    }

    public static boolean isPrime(int n){
        for(int j = 2; j < n; j++){
            if(n % j == 0){ // the number was divisible by another number that was not 1 or itself
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int limit){
        for(int i = 2; i <= limit; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

}
/*
[IQ] Prime in range [nested loop, methods, conditional]

	create a method that will accept a number. Print out all the prime numbers in the range between 2 and the given number

	a number is a prime number when it is only divisible by 1 and itself

	ex:
		Input:
			50
		Output:
			2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */


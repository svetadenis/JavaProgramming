package week6_OfficeHours_Saturday;

public class Palindrome {

    public static String reverse(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String str){
        return str.equals(reverse(str));
    }

    public static boolean isPalindrome2(String str){ // anna
        int z = str.length() - 1;
        for(int i = 0; i < str.length()/2; i++){
            System.out.println(i + " " + str.charAt(i));
            System.out.println(z + " " + str.charAt(z));
            if(str.charAt(i) != str.charAt(z)){ // if the chars are not the same, they are not palindrome
                return false;
            }
            z--;
        }

        return true;
    }

    // length - 1 is the last index and doing minus i everytime will adjust the index for the same number it times i is incremented. If i has been incremented by 3 the 3rd from the end char will be checked
    public static boolean isPalindrome3(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    /*
        str.length() /2  --> we only need to check until the middle, we cut the number of iterations in half

        we are going to use a variable to track the characters from the beginning (i variable) and from the end (z variable)

         inside the loop we are going to check for when the characters are not the same
         -> when they don't match it is not palindrome -> return false

        anna

     */


}
/*
[IQ] Palindrome [method, String, loop]

	create a method that will accept a String and return a boolean. Determine if the given String is a palindrome.
	A palindrome is when the characters being read from the beginning match the characters being read from the end. In other words, the reverse order of the word is the same as the original word order

		Ex:
			racecar
			true

			anna
			true

			abc
			false

			abcba
			true
 */
package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        String result = "";//"abc"

        for (int i = 0; i < str.length(); i++) {//i:index number of str
        char each = str.charAt(i);//each character of the String str

        if (!result.contains("" + each)) {//if the string result doesn't contain string str yet
            result += each;//then we will add the character to string result


    }

//if the character is not contained yet in the new string, then we add it to the new string

            System.out.println(result);
    }

}}


/*
Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */
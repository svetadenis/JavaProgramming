package week6_OfficeHours_Saturday;

public class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("ahhhbchidefhihellohiihiiworld"));
    }
    public static int countHi(String str){ // ahhhbcdefhelloiiiworld
        int count = 0; // 3
        while(str.contains("hi")){
            count++;
            str = str.replaceFirst("hi", "**"); // this removes it from the String
            System.out.println(str);
        }
        return count;
    }
}
/*
Count Hi [method, loop, String]

	create a method that will accept a String and count how many times the word "hi" is found in the String. return the count

		ex:
			input: aahiahiaaahh
			output: 2
				"hi" was found 2 times

			input: ahhhbchidefhihellohiiiiworld
			output: 3
				"hi" was found 3 times

	extra: overload the method to search for any word, not just "hi"

 */


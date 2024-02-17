package week6OfficeHours;

public class BeginningAtEnd {

    public static void main(String[] args) {

        String str = "eraser for the computer";
        int lastIndex = str.length() - 1;
        boolean isValid = str.charAt(0) == str.charAt(lastIndex - 1) && str.charAt(1) == str.charAt(lastIndex);
        System.out.println(isValid);

        boolean isValid2 = str.substring(0, 2).equals(str.substring(str.length() - 2));
        System.out.println(str.substring(0, 2));
        System.out.println(str.substring(str.length() - 2));

        boolean isValid3 = str.endsWith(str.substring(0, 2));
        System.out.println(isValid3);


    }
}
/*
T2BeginningAtEnd [String, indexes]

	Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same

	ex:
		educated -> true
		java -> false
		eraser for the computer -> true
		panda giftwrap -> false
 */

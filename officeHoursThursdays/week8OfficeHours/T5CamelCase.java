package week8OfficeHours;

public class T5CamelCase {
    public static String makeCamelCase(String str) { //  JAVA will ruLE tHe wORLd

        String camelCase = ""; // RuleTheWorld
        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            char eachLetter = str.charAt(i);

            if (eachLetter == ' ') {
                camelCase = camelCase.substring(0, 1).toUpperCase() + camelCase.substring(1);
            } else {
                camelCase = eachLetter + camelCase;
            }
        }
        return camelCase;
    }
}
/*
T5CamelCase [loop, String, method]

    create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is uppercase and the rest of the word is in lowercase.

    Exception: The first word starts with a lowercase

    Ex:
        Input:
            JAVA will ruLE tHe wORLd
        Output:
            javaWillRuleTheWorld
 */


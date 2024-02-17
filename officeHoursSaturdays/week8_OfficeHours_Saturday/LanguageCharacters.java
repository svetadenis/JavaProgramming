package week8_OfficeHours_Saturday;

import java.util.Arrays;
public class LanguageCharacters {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCharsFor("english")));
        System.out.println(Arrays.toString(getCharsFor("greek")));
        System.out.println(Arrays.toString(getCharsFor("arabic")));
        System.out.println(Arrays.toString(getCharsFor("japanese")));
        System.out.println(Arrays.toString(getCharsFor("braille")));
    }

    public static char[] getCharsFor(String language){
        char[] range = getRangeFromLang(language); //[33, 126]
        char[] allChars = new char[range[1] - range[0]];
        for(int i = 0, j = range[0]; i < allChars.length; i++, j++) { // i is the index to assign to allChars. j is the starting character value
            allChars[i] = (char)j;
        }
        return allChars;
    }

    public static char[] getRangeFromLang(String language){
        char[] range = new char[2]; // first pos -> start, second pos -> end

        switch (language){
            case "english":
                range[0] = 33;
                range[1] = 126;
                break;
            case "greek":
                range[0] = 884;
                range[1] = 1011;
                break;
            case "arabic":
                range[0] = 1548;
                range[1] = 1790;
                break;
            case "chinese":
            case "japanese":
            case "korean":
            case "vietnamese":
                range[0] = 63744;
                range[1] = 64045;
                break;
            case "braille":
                range[0] = 10240;
                range[1] = 10495;
                break;
        }

        return range;
    }
}

/*
LanguageCharacters [array, char, loop, method]

    Create a method that will accept a String for the language name. Based on the given language name return a char array of the characters that are used in that language. We will use ascii numbers

    Use the following ranges:

    English: 33 - 126

    Greek: 884 - 1011

    Arabic: 1548 - 1790

    Chinese, Japanese, Korean or Vietnamese:  63744 - 64045
        (this group of characters are the: CJK Compatibility Ideographs)

    Braille: 10240 - 10495
 */

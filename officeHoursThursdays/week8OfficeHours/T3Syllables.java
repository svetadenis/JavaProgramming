package week8OfficeHours;

public class T3Syllables {
    public static int countSyllables(String word){
        int originalLength = word.length();
        word = word.replace("-", "");
        return originalLength - word.length() + 1; // originalLength - word.length() -> counts the number of dashes | then the plus 1 makes it from the number of dashes to the number of syllables
    }

    public static int countSyllables2(String word) {
        int syllables = 1;
        while(word.contains("-")){
            syllables++;
            word = word.replaceFirst("-", "");
        }
        return syllables;
    }

    public static int countSyllables3(String word) {
        int syllables = 1;
        for(int i = 0; i < word.length(); i++){
            if (word.charAt(i) == '-') {
                syllables++;
            }
        }
        return syllables;
    }

}
/*
T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        cat -> 1
        ham-bur-ger -> 3
        de-liv-er-y -> 4
 */


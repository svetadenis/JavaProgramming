package week10_OfficeHours_Saturdays.ExtraChallenge;

import week8_OfficeHours_Saturday.LanguageCharacters;

import java.util.Arrays;
import java.util.Random;

/*
  create an array with 10 random characters
        bonus: create an array of 10 random characters of a specific language(use the language array method we made during the review)
 */
public class RandomCharacters {

    public static char[] getRandomCharacters(char[] data) {
        char[] randomChars = new char[10];
        Random random = new Random();

        for (int i = 0; i < randomChars.length; i++) {
            randomChars[i] = data[random.nextInt(data.length)]; // a random number is generated from 0 - length of chars. That random num is the index for the element in the data array
        }

        return randomChars;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getRandomCharacters(LanguageCharacters.getCharsFor("english"))));
        System.out.println(Arrays.toString(getRandomCharacters(LanguageCharacters.getCharsFor("arabic"))));
        System.out.println(Arrays.toString(getRandomCharacters(LanguageCharacters.getCharsFor("braille"))));

    }

}
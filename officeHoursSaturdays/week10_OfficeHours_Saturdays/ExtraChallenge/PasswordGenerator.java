package week10_OfficeHours_Saturdays.ExtraChallenge;

import java.util.Random;

// create a password generator
public class PasswordGenerator {

    public static String generatePassword(int length) {
        Random random = new Random();
        String password = "";

        char[][] charSet = {
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
                {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'},
                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
                {'!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@'}
        };

        for (int i = 0; i < length; i++) {
            int type = random.nextInt(charSet.length);
            char randomChar = charSet[type][random.nextInt(charSet[type].length)];
            password += randomChar;
        }

        return password;
    }

    public static void main(String[] args) {
        System.out.println(generatePassword(10));
        System.out.println(generatePassword(16));
    }

}
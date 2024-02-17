package week4OfficeHours;

public class T2CharTask {
    public static void main(String[] args) {
        char letter = 'y';

        boolean isUppercase = letter >= 'A' && letter <= 'Z'; // letter >= 65 && letter <= 90
        boolean isLowercase = letter >= 'a' && letter <= 'z'; // letter >= 97 && letter <= 122

        // original
//        if(isUppercase){
//            System.out.println(letter + " is uppercase");
//        } else if(isLowercase){
//            System.out.println(letter + " is lowercase");
//        }

        // updated to be less repetition
        String result;
        if (isUppercase) {
            result = "uppercase";
        } else if (isLowercase) {
            result = "lowercase";
        } else {
            result = "not alphabetical";
        }
        System.out.println(letter + " is " + result);

        if ((isUppercase && letter <= 'Z' - 3) || (isLowercase && letter <= 'w')) {
            System.out.println("The next three chars are: " + ++letter + ", " + ++letter + ", " + ++letter);
        } else {
            System.out.println(letter + " is too close to the end");
        }
    }}

       /* char letter = 'A';

        boolean isUppercase = letter >= 'A' && letter <= 'Z'; // letter >= 65 && letter <= 90
        boolean isLowercase = letter >= 'a' && letter <= 'z'; // letter >= 97 && letter <= 122

        // original
//        if(isUppercase){
//            System.out.println(letter + " is uppercase");
//        } else if(isLowercase){
//            System.out.println(letter + " is lowercase");
//        }

        // updated to be less repetition
        String result;
        if (isUppercase) {
            result = "uppercase";
        } else if (isLowercase) {
            result = "lowercase";
        } else {
            result = "not alphabetical";
        }
        System.out.println(letter + " is " + result);
    }}
/*

T2CharCase [variables, if statement, operators]

    Create a program that will define a char variable, which will only be defined as an alphabetical letter. The character can be defined in uppercase or lowercase and we want to determine which case it is

    Part 2: also print the next 3 characters after the given character, but only print them if they will not go past z or Z

    Output in this format:
        $character is $uppercase_or_lowercase
        The next 3 chars are: c1, c2, c3

        ex:
            'm'
            m is lowercase
            The next 3 chars are: n, o, p

            'Y'
            Y is uppercase
            too close to the end

 */

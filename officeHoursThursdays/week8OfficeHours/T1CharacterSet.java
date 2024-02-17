package week8OfficeHours;

public class T1CharacterSet {
    public static String getCharacterSequence(char start, char end){
        String sequence = "";
        for( ; start <= end; start++){ // we choose not to declare a variable, because we already had the variables we needed
            sequence += start; // sequence = sequence + start;
        }
        return sequence;
    }

    public static String getCharacterSequence(String str){
        char start;
        char end;
        switch (str){
            case "uppercase":
                start = 'A';
                end = 'Z';
                break;
            case "lowercase":
                start = 'a';
                end = 'z';
                break;
            case "digit":
                start = '1';
                end = '9';
                break;
            case "special":
                start = '!';
                end = '.';
                break;
            default:
                return str + " sequence not valid";
        }

        return getCharacterSequence(start, end);
    }

/*
    public static String getCharacterSequence(char start, char end){
        String sequence = "";
        for(char letter = start; letter <= end; letter++){ // we choose not to declare a variable, because we already had the variables we needed
            sequence += letter; // sequence = sequence + start;
        }
        return sequence;
    }
    public static String getCharacterSequence(char start, char end){
        String sequence = "";
        for(int letter2 = start; letter2 <= end; letter2++){ // we choose not to declare a variable, because we already had the variables we needed
            sequence += (char)letter2; // sequence = sequence + start;
        }
        return sequence;
    }
    public static String getCharacterSequence(char start, char end){
        String sequence = "";
        while(start <= end){
            sequence += start++;
        }
        return sequence;
    }

    */

}
/*
T1CharacterSet part 1 [methods, loops]

	Create a method that will accept two chars and return a String.
	Based on the given chars, output a character sequence where the first char is the starting character and the second char is the ending character for the sequence

	Note: the character sequence will go in order, so the starting char should come before the ending char. Use the ascii table is a reference

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
 */

/*

T1CharacterSet part 2 [methods, loops, overloading]

    Create a method (overloading the method from part 1) that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.

    so if the method is called with the argument "digit" then the method will return the String "123456789"
 */

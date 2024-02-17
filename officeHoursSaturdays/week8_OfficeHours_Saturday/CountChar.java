package week8_OfficeHours_Saturday;

public class CountChar {
    public static int countChar(String[] words, char letter){

        int count = 0;

        for(String each : words){ // iterates through each element of the words array
            System.out.println("DEBUGGING " + each);
            for(char eachLetter : each.toCharArray()){ // iterates through each char of each word
                System.out.println("DEBUGGING " + eachLetter);
                if(eachLetter == letter){ ///eachLetter == each.charAt(i)
                    count++;
                }
            }
        } // "java", "html", "css", "java", "javascript", "selenium"

        return count++;
    }
}
/*
CountChar [Array, String, loop]

    Create a method that defines a String array and a char letter. Return how many times the given char letter is found in all the elements of the array

        Ex:
        Input:
            "java", "html", "css", "java", "javascript", "selenium"
            letter: ‘a’
        Output:
            6
 */


package day17_customClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";
    for(int j=0; j<str.length();j++){//responsible to repeat the program's body on each step

        char ch = str.charAt(j);//a compare with any other character in a string
        int frequency = 0;
        for(int i=0;i<str.length();i++){//how many times the ch has appeared in str
            if(str.charAt(i)==ch){
                frequency++;//increase the frequency by 1
            }
        }
        if (frequency == 1){//if the frequency is one, then it's unique
            unique+=ch;
        }
    }
        System.out.println(unique);//bd
}}


/*
Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */

package day17_customClass;

public class UniqueCharacters1 {
    public static void main(String[] args) {


    String str="aabcccd";
    String unique="";
    for (int i=0;i<str.length(); i++){//i:index numbers of str
        char each = str.charAt(i);

        if(str.indexOf(each) == str.lastIndexOf(each) ){//if the character is not appear in a string more then once
            //then it's a unique character
            unique+=each;
        }
    }
        System.out.println(unique);
//first index of character a is 0, last character of a in a string is 1.a not equal 1, then it's not unuque
//if the first time when the character is appeared and the las time when the character is appeared is aquvalent then this is character is unique
 //first time index of character b is 2 and the last time is 2.2=2, then this character is unique
    }}


/*
Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */
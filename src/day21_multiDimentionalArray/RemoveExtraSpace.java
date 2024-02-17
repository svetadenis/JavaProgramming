package day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {
    public static void main(String[] args) {

    String str = "    Hello  world  I  love Java    ";
   // str = str.trim();
    //System.out.println(str);//Hello  world  I  love Java

    String[] words = str.split(" ");
    //System.out.println(Arrays.toString(words));//[Hello, , world, , I, , love, Java]

    str="";
    for(String each: words){
        if(!each.isEmpty()){
            str=str+each+" ";
        }
    }
    str=str.trim();//no more extra spaces
    System.out.println(str);//Hello world I love Java
}}


/*
Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */
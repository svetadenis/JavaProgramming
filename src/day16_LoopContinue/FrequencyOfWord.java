package day16_LoopContinue;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";

        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence=sentence.replaceFirst("Java",  "");//"Java Java Java
            // we have to make sure that Java will not be back in a string again,
            //so, we just replaced Java to""
            //it will continue untill java is anymore in a sentence
        }
        System.out.println(count);
    }
}


/*
Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
    "Java Java Java Java";//count = 0;
    "Java Java Java"//count = 1;
    "Java Java"//count = 2;
    "Java"//count=3
    " "//count =4
 */
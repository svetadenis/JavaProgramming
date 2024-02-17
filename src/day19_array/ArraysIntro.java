package day19_array;
import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[] args) {
        int score1 = 85;//regular variable. it is not allowed to store more data,then 1. amount 85
        int score2 = 75;
        int score3 = 65;
        int score4 = 55;
        int score5 = 45;
        System.out.println("____________________________________________");

        int [] scores = new int [5];//i want my arrays contain 5 elements. index 0 until 5
        //0 0 0 0 0
        scores[2] = 78;//it means index 2 will be changed on 78
        //0 0 78 0 0
        scores[0] = 85;//index 9 will be changed on 85
        //85 0 78 00
        scores[1] = 11;
        //85 11 78 0 0
        scores[3] = 88;
        //85 11 78 88 0
        scores[4] = 22;
        //85 11 78 88 22
        //scores[5] =100;//wrong, because we assigned 5 elements(4 indexes) in line 12

        System.out.println(Arrays.toString(scores));//[85, 11, 78, 88, 22]
      //  scores = new int[10];//index 0~9
      //  scores = new int[50];//index 0~49
        //after execution line 28, lines 12 and 27 are ready for garbage collection
      //  System.out.println(Arrays.toString(scores));//[0    49 times] you can't assign lign 12 to lign 27 and 28 brcause it's different objects

        System.out.println(scores[2]);//78

        System.out.println("__________________________________________");

    for (int i=0; i<scores.length;i++){//i: index numbers of scores array
        //i<scores.length total number of elements contained in array
        System.out.println(scores[i]);
        System.out.println("____________________________________________");}

        System.out.println(scores[scores.length-1]);//in order to return last index number





    }
}

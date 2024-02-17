package day16_LoopContinue;
import java.util.Scanner;
public class LoopPractices {
    public static void main(String[] args) {

        for(int i = 1; i<6; i++){
            System.out.println("Hello" +i);//repeats five times
        }
        System.out.println("_____________________________________");

        for (int i =0;i<5;i++){
        System.out.println("Hello"+i);
    }
        System.out.println("_______________________________________");

        int j=0;
        while(j<5){
            System.out.println("Hello"+j);
            j++;
        }
        System.out.println("________________________________________");

        int k=0;
        do{
            System.out.println("Hello"+k);
            k++;
        }while(k<5);

        System.out.println("________________________________________");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();

        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        while(score>100 || score <0){
            System.out.println("Invalid score, please re - enter your score");
            input.nextInt();
            score=input.nextInt();
        }
}}

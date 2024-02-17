package day08_ternary_switch;

public class TernaryIntro3 {
    public static void main(String[] args) {
        int score = 130;
        String result = (score >= 0 && score <= 100)?
                (score>=60)?"Passed":"Failed"
                :"Invalid";
        System.out.println(result);


    /*    int score = 130;
        String result = "";
        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }

        } else {
            result = "Invalid";
        }
        System.out.println(result);*/
/*
  public static void main(String[] args) {

        int score = 95;
        if(score>=0&&score<=100){// if the score is valid
        }else{
            System.out.println("Invalid Score");
        }
        if (score >=60){
            System.out.println("Passed");
        } else{//if the score is not valid
            System.out.println("Failed");
        }
    System.out.println("______________________________________");
 */

    }}


package day07_ifStatements;

public class NestedIfIntro {
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

     int age = 32;//ages should be only from range 1-120
        if(age>=1 && age<=120) {//preexisting condition
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        }else{
            System.out.println("Invalid age");
        }
        System.out.println("_______________________________________");

int day = 5;
    if(day >=1 && day<=7){

        if(day==1) {
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        }
        else if (day == 4){
            System.out.println("Thursday");
        }
        else if (day == 5){
            System.out.println("Friday");;
        }
        else if (day == 6){
            System.out.println("Saturday");;
        }
        else if (day == 7){
            System.out.println("Sunday");;
        }
        }else {//if the precondition is failed
            System.out.println("Invalid Day");
        }
    }
}








package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 90;// it can be any number between 0 and 100
        String result = "Your grade is ";
        if (score >=90){//false: score <90
            result +="A";
        }else if (score>=80){ //false score<80
            result +="B";
        }else if (score>=70){//false, if score<70
            result +="C";
        }else if (score>=60){//false, if score<60
            result +="D";
        }else {
            result += "F";
        }
        System.out.println(result);


       /* int score = 90;// it can be any number between 0 and 100
        String result = "Your grade is ";
        if (score >=90){
        result +="A";
        }else if (score>=80&&score<90){
        result +="B";
        }else if (score>=70&&score<80){
        result +="C";
        }else if (score>=60&&score<70){
        result +="D";
        }else {
        result += "F";
        }
        System.out.println(result);
        */
    }}

/*An integer variable named score is declared and given,
write a program that can print the grade of the student

Ex:
score=95
output:
Your grade is A
Assume that the given score is between 0-100
 */
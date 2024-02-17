package day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel = 16;//any number between 1 and 18
        String result = "";// just for temporary value
        if (gradeLevel <= 5) {//false if grade level >= 6
            result = "Elementary School";
        } else if (gradeLevel <= 8) {//false if grade level >=9
            result = "Middle School";
        } else if (gradeLevel <= 12) {//false if grade level >=13
            result = "High School";
        } else if (gradeLevel <= 16) {//false if grade level >=17
            result = "College";
        } else {
            result = "Grad School";
        }
        System.out.println(result);

       /* int gradeLevel = 16;//any number between 1 and 18
        String result = "";// just for temporary value
        if (gradeLevel >= 1 && gradeLevel <= 5) {
            result = "Elementary School";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            result = "Middle School";
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            result = "High School";
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            result = "College";
        } else {
            result = "Grad School";
        }
        System.out.println(result);*/
    }
}

/*An integer variable named gradeLevel is declared and given, write a program to determine and print which
school type someone is in

Ex:
gradeLevel = 2
output:
Elementary School

The grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
 Assume that the given number is 1-18
 */


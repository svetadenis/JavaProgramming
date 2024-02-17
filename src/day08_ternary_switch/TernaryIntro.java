package day08_ternary_switch;

public class TernaryIntro {
    public static void main(String[] args) {

        int score = 85;
        String result = "";

        if (score>=60) {
            result = "Passed";
        }else{
            result = "failed";
        }
        System.out.println(result);//passed
        System.out.println("________________________________________");

        String result2 = (score>=60) ? "Passed": "Failed";//passed

        System.out.println("_________________________________________");

       int age = 34;
       /*
        String r;
        if (age >=21) {
            r = "Eligible";
        }else{
            r = "Not eligible";
        }*/
    String result3 = (age>=21)? "Eligible":"Not eligible";
        System.out.println(result3);//eligible


    }
}


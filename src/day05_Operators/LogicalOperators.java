package day05_Operators;

public class LogicalOperators {
    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;

        boolean eligibleForLoan = salary>=30000 && creditScore >= 650;
        System.out.println(eligibleForLoan);// true, both conditions are qualify

        double salary1 = 60000;
        int creditScore1 = 500;

        boolean eligibleForLoan1 = salary1>=30000 && creditScore1 >= 650;
        System.out.println(eligibleForLoan1);//false, credit score < 650

        System.out.println("_________________________________________________");

        double salary2 = 60000;
        int creditScore2 = 650;
        int age = 42;
        boolean eligibleForLoan2 = salary2 >= 30000 && creditScore2 >=650 && age >= 18;
        System.out.println(eligibleForLoan2);//true. 30000>60000, 650=650, 42>=18
        System.out.println("__________________________________________________");

        age = 18;
        String country = "USA";
        boolean eligebleToVote = age>= 18 && country == "USA";
        System.out.println(eligebleToVote);//true

        age = 18;
        String country1 = "Japan";
        boolean eligebleToVote1 = age>= 18 && country1 == "USA";
        System.out.println(eligebleToVote1);//false
        System.out.println("______________________________________________");


        String answer = "no";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);//true
        System.out.println("______________________________________________");

        char grade = 'B';
        boolean passedTheExam = grade == 'A'||grade=='B'||grade=='C'||grade=='D';
        System.out.println(passedTheExam);//true, because it's A or Bor C orD. It doesn't metter.

        System.out.println("______________________________________________");

        System.out.println(!true);
        System.out.println(!false);


        String a = "yes";
        boolean yes = a == "yes";//true
        boolean no = !yes;//false
        System.out.println("yes = " +yes);
        System.out.println("no = " +no);
        System.out.println("______________________________________________");

        int score = 65;
        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("passed = " +passed);//true
        System.out.println("failed = " +failed);//false

        System.out.println("______________________________________________");

        System.out.println(true == !false && false == !true && true != !true);//true

        //                     true       &&       true      &&      true

       /* String a = "yes";
        boolean b = (a == "yes");//true
        boolean c = !b;//false
        System.out.println("yes = " +b);
        System.out.println("no = " +c);
        System.out.println("______________________________________________"); */













    }
}

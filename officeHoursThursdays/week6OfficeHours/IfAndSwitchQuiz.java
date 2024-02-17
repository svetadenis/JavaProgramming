package week6OfficeHours;

public class IfAndSwitchQuiz {
    public static void main(String[] args) {

        // 71% average | we did good

        System.out.println("======= Question 1 =======");

        int score = 0;

        if (score == 0) { // true
            score += 50; // score = 50
        }

        if (score != 0) { // 50 != 0
            score += 50; // score = 50 + 50 = 100
        }

        System.out.println(score);

        System.out.println("======= Question 4 =======");

//        boolean result = true;
//
//        if(result){
//            System.out.println("it's true");
//        } else {
//            System.out.println("it's false");
//        } else if(result){
//            System.out.println("None of the above");
//        }

        System.out.println("======= Question 6 =======");

        int num = 10;

        if (--num == 10) { // pre-decrement, so num becomes 9 then the comparison is checked: 9 == 10 => false
            System.out.println("Hello Cydeo " + num);
        } else { // else block runs
            System.out.println("Hello World " + num);
        }

        System.out.println("======= Question 7 =======");
        System.out.println("Does an if statement need an else block? NO");

        System.out.println("======= Question 8 =======");

        boolean X = true;
        boolean Y = !X == false;
        boolean Z = Y;

        if (X) {
            System.out.println("Hello Everyone");
        }
        if (Y) {
            System.out.println("Today is a great day");
        }
        if (Z) {
            System.out.println("We are improving everyday");
        }

        // all three if statements will be checked because they are single if statements

        System.out.println("======= Question 9 =======");

        int n = 9;

        if (n++ == 10) { // post-increment, so the comparison is checked first: 9 == 10 -> false | after the result is found the n will increment and becomes 10
            System.out.println("Hello World " + n);
        } else { // else block runs
            System.out.println("Hello Universe " + n); // when it prints here the value is 10
        }

        System.out.println("======= Question 10 =======");
        System.out.println("Which datatypes cannot be compared in a switch statement? long, float, double, boolean");
        int val = 0;
        switch (val) {

        }

        System.out.println("======= Question 13 =======");

        int x = 10;
        switch (x) {
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            default:
                System.out.println("Friday");
        }


    }
}


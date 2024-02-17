package day07_ifStatements;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {
        int age = 32;
        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("_______________________________________");

if (age>=21) System.out.println("Eligible");
else System.out.println("Not eligible");
        System.out.println("_______________________________________");

    int itemNum = 3;
    if(itemNum ==1)
        System.out.println("Eggs");
        //System.out.println("Orange");//if we have one fragments we can run program without curly brasket
    else if (itemNum ==2){
        System.out.println("Milk");//but, if we have two fragments or more, we can run the program only with curly brasket
        System.out.println("Onion");
    }else{
        System.out.println("Apple");
        System.out.println("Cherry");
    }
        System.out.println("_____________________________________");

    int day = 2;//days can be from 1 to 7
    if (day == 1) System.out.println("Monday");
    else if(day== 2) System.out.println("Tuesday");
    else if (day == 3) System.out.println("Wednesday");
    else if (day == 4) System.out.println("Thursday");
    else if (day == 5) System.out.println("Friday");
    else if (day == 6) System.out.println("Saturday");
    else if (day == 7) System.out.println("Sunday");

// if statement without curly braces, it's not a good practice






    }
}

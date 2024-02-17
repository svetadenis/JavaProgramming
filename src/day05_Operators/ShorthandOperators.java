package day05_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);//20
        System.out.println(a);//20
        a = 40;
        System.out.println(a);//40
        System.out.println("____________________________________________");

        double balance = 100;
        balance += 1000;// balance = 100+1000
        System.out.println("balance is " + balance);
        balance +=500; //balace  = 1100+500
        System.out.println("balance is " + balance);
        balance -=1000;//balance = 1600-1000
        System.out.println("balance is " + balance);
        balance -=5000;//bslsnce = 699-4400
        System.out.println("balance is " + balance);
        System.out.println("_______________________________________________");

        double salary = 45000;
        salary *= 2;// salary = 45000*2
        System.out.println(salary);
        salary *=3;
        System.out.println(salary);//90000*3

        double eth = 4;
        eth *=250;
        System.out.println("eth = " + eth);//250*4
        eth/=2;
        System.out.println("eth = " + eth);//1000/2

        salary /=2;
        System.out.println("salary = " + salary);//270000/2

        int b = 39;
        b %= 7; //b = 39%7
        System.out.println(b);












    }
}

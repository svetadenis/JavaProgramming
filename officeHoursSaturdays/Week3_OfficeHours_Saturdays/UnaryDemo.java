package Week3_OfficeHours_Saturdays;

public class UnaryDemo {
    public static void main(String[] args) {
        int count = 0;
        count++;//1
        count++;//2
        count++;//3
        System.out.println(count);

        int a = 3;
        int b = ++a; //pre increament: update by 1, then does
        //the function/operation/action
        System.out.println(a);//4
        System.out.println(b);//4

        int sum = 5;
        sum +=1;//short version of sum=sum+1
        System.out.println(sum);

        int c = 10;
        int d = c++;
        System.out.println(d);//10 post increment: does the dunction first, then it updated by 1
        /*
        int c = 10;
        int d=s; ->d is 10
        c++->this becomes 11
        */

        int n=4; //n->5
        int m = n++*2; //int m = n*s->
        System.out.println("n="+n);//5
        System.out.println("m="+m);//8

        int z = 20;
        int y = --z;

        System.out.println(z);//19
        System.out.println(y);//19

        int x = 15;
        int u = x-- + x++ + ++x;
        //      15  + 14  + 16
        System.out.println(u);
        System.out.println(x);//16








    }
}

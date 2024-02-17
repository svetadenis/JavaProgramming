package week8OfficeHours;

public class quizKahoot {
    public static void main(String[] args) {


        int x = 3;
        int y = 5;
        if (++x < (y = y - 2) || (x = x + 2) >= y) {
            System.out.println(x + "-" + y);//6-3
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i = i + 3;
        }//will be printed twice: first when i=o, second when i=3

        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i + "");//123
            //4 is not included because of the break
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration" + i);
            if (i == 3) {
                break;
            }
        }
        System.out.println("_______________________");

        String str = "Hello";
        String res = "";
        for (int k = str.length() - 1; k >= 0; k--) {
            res = res + str.charAt(k);
        }
        System.out.println(res);//olleH

        System.out.println("_____________");

        for (int p = 0; p <= 10; p++) {
            if (p == 5)
                continue;
            System.out.println("" + p);//12346789
            //5 is not included
        }

        int h = 7;
        int t = 5;

        if (h > t)
            System.out.println(true);
        System.out.println(false);//print anyway
        System.out.println("Java");//print anyway
        System.out.println("_______________________");

        int marks = 50;
        if (marks <= 70)
            System.out.println("denstinction");
        else if (marks >= 35)
            System.out.println("Pass ");
        else
            System.out.println("Fail");

        //distinction

   /*     int l = 1;
        while(l<6){
            System.out.println("Hello");
            if(l==4)
                break;
      infinite loop
                */


        int i = 5;
        do {
            System.out.println("Cydeo");//print just one time
            i++;
        }
        while (i < 5);
        System.out.println("_______________________________________");

        int m = 0;
        for (; m <= 5; m++) {
            System.out.print("m=" + m);
        }
        System.out.print("m after the loop = " + m);
        //m=0m=1m=2m=3m=4m=5m after the loop = 6 because we started from 0, not from 1
        //so it will be 6  loops not 5

        System.out.println("__________________________________");
        boolean flag = true;
        for (int s = 0; s <= 5; s++) {
            if (flag) {
                System.out.print(s + "");//0 2 4
            }
            flag = !flag;
        }
        System.out.println("___________________________________");

        String str1 = "Java";
        String str2 = new String(str);
        int count = 10;
        do {
            count = count + 2;
        } while (str1 == str2);
        System.out.println(count);//12

        System.out.println("_______________________________________");

        for (int d = 0; d < 10; d++) {
            if (d == 5) {
                continue;
            }
            System.out.print("" + d);//012346789
        }
        System.out.println("_________________________________________");

        int time = 50;
        do {
            System.out.println(time + ",");
            time++;
        } while (time < 53);//50 51 52

        System.out.println("________________________________________");

        for (int w = 0; w < 5; w++) {//will be 5 loops because we started from 0, not from 1
            for (int g = 3; g >= 1; g--) {
                System.out.print(g + ",");
            }
            System.out.println();
            /*
            3,2,1
            3,2,1
            3,2,1
            3,2,1
            3,2,1
             */
        }

        int r = 0;
        while (r < 4) {//it will print 4 not 3 because we started from 0. 4 loops
            r = r + 1;
        }
        System.out.println(r);//4


   /*    int age = 50;
        do {
            System.out.print(age + " ");
        } while (age < 53);
    }
    //infinite loop

    */
       System.out.println("_________________________________________");
  //                       0             1             2          3        4          5      6         7                 8        9          10
    String[] dailyQ = {"wish you", "an awesome week","please","give up","you can", "never","succed","keep studying", "everyday", "no way", "you will succed!"};
    String javaFun="true";
    boolean False = javaFun.length()>=4?true:false;
    while(False){
        System.out.print(dailyQ[2]+" "+dailyQ[5]+" "+dailyQ[3]+" "+dailyQ[7]+" "+dailyQ[8]+","+dailyQ[10]+"\n");
        if(False==true)
            System.out.println("See you on meeting Team");

//infinite loop. Please never give up keep studying everyday,you will succed!
//  See you on meeting Team

}}}
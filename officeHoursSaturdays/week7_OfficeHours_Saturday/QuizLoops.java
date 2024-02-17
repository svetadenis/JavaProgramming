package week7_OfficeHours_Saturday;

public class QuizLoops {
    public static void main(String[] args) {

        int a = 0;
        while(a<=6){
            a=a+2;

        }
        System.out.println("a="+a);//8

        System.out.println("_____________________________________");
        int j = 7;
        for(int i = 0; i<j-1;i=i+2)
            System.out.println(i);//0 2 4
        System.out.println("_______________________________________");

        int z=5;
        for(int i=5;i>0;i--){
            z=z+1;
        }
        System.out.println(z);//10
        System.out.println("__________________________________________");

        int num=10;
        do{
            num=num+5;
        }while(num<15);
        System.out.println(num);//15


        String s = "Cydeo";
        for (int i=0;i<s.length();i=i+3){
            System.out.println(s.charAt(i));//Ce
        }
    }


}

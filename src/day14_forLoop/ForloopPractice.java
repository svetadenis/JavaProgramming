package day14_forLoop;

public class ForloopPractice {
    public static void main(String[] args) {
        /*for(int i=5;i<=10;i--){

        System.out.println("Hello World");//цикл будет повторяться бесконечное число раз
        }*/

    for(int i=10; i>=5; i--){//i:10,9,8,7,6,5,
        System.out.println("Hello Cydeo");//1,2,3,4,5,6
    }

        System.out.println("_________________________________________________");

    //Task 1 print sum of all the numbers 1~100
        int sum=0;
        for (int i=1; i<=100; i++){
            sum+=i;
        }
        System.out.println(sum);//5050

    //task2 print all the alphabet letters in backwards
        //for(char i = 'A'; i<='Z'; i++){
           // System.out.print(i+" ");//print all letters in one line;
           // System.out.println(i+" ");//print all letters in one column

            for(char i ='Z';i>='A';i--){
            System.out.print(i+" ");//print backwards in one line
            }
        }
}

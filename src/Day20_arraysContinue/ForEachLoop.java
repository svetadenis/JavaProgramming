package Day20_arraysContinue;

public class ForEachLoop {
    public static void main(String[] args) {


    int[] numbers = {10,20,30,40,50};
    for (int i = 0; i < numbers.length; i++){//initialization;condition;itirator
        System.out.println(numbers[i]);//10 20 30 40 50
    }

System.out.println("____________________________________________________");
//if you have 5 elements, this loop will run exactly five times: no less, no more
        //int because variables are int
    for(int each:numbers){
        System.out.println(each);//10 20 30 40 50
    }
}}

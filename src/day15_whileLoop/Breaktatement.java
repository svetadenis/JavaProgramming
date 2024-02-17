package day15_whileLoop;

public class Breaktatement {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            if(i==6){//if it's value reaches 6
                break;//exits the loop
            }
            System.out.println(i);//0 1 2 3 4 5
        }
        System.out.println("_________________________________________");

    for (char i = 'A';i<='Z'; i++){
        if(i=='J'){
            break;//loop is terminated
        }
        System.out.println(i);//print from A to I, do not pring J
    }
        System.out.println("________________________________________");

    for(;;){//infinite loop
        System.out.println("Hello");
        break;
        //System.out.println("Word");//error. we have to print after}
    }


    }
}

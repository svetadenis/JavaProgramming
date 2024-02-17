package day23_arrayListContinue;

import java.util.ArrayList;

public class AvarageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);//[20, 30, 40, 50, 60, 70]
        int sum = 0;
        for (Integer each: list) {
            sum = sum+each;}//20+30+40+50+60+70

        double average = sum/list.size();
        System.out.println("average = "+average);//45

    }
}

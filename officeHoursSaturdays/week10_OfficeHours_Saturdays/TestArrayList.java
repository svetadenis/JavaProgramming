package week10_OfficeHours_Saturdays;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {

       /* ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i = list.size(); i >=0 ; i--) {
            System.out.println(list.get(i));
        }*/

       /* ArrayList<String> list = new ArrayList<>();
        for (String each:list) {
            System.out.println(each);*/

       /* ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.removeIf(p->p<4);
        System.out.println(list);//[4,5]*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println(list);//10


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
         Integer b = 1;
         list2.remove(b);
        System.out.println(list2);//[2,3]

        ArrayList<String> colors = new ArrayList<>();
        colors.add("greean");
        colors.add("red");
        colors.add("bl");
        colors.add("yel");
        colors.add(3,"cy");
        System.out.println(colors);//[greean, red, bl, cy, yel]

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));
        list3.set(0,list3.get(4));
        list3.set(4,list3.get(0));
        System.out.println(list3);//[5, 2, 3, 4, 5]


        ArrayList<Character> list4 = new ArrayList<>();
        for (char i = 'a'; i <'z' ; i++) {
            list4.add(i);
        }
        boolean r = list4.containsAll(Arrays.asList('a','c','D'));
        System.out.println(r);//false


        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7));
        for(Integer each:list5) {
            if (each % 2 != 0) {
                continue;
            }
            System.out.println(each);//2
            break;
        }


        }
}


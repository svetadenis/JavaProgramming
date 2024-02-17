package week11_OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;

    public class ArrayListQuiz {
        public static void main(String[] args) {

            System.out.println("======= Question 1 =======");
        /* these two are NOT valid days to declare an ArrayList
            ArrayList<> list =  {"hello", "java", "sunday"};
            ArrayList<double>  list =  new ArrayList<>( );
         */

            System.out.println("======= Question 3 =======");
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            int a = 1;
            list.remove(a);
            System.out.println(list);

            System.out.println("======= Question 4 =======");
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            list2.add(3);
            Integer b = 1;
            list2.remove(b);
            System.out.println(list2);


            System.out.println("======= Question 5 =======");
            ArrayList<String> colors = new ArrayList<>();
            colors.add("green");
            colors.add("red");
            colors.add("blue");
            colors.add("yellow");
            colors.add(3, "cyan");
            System.out.println(colors);

            System.out.println("======= Question 7 =======");
            ArrayList<Integer> list3 = new ArrayList<>();
            list3.addAll(Arrays.asList(1, 2, 3, 4, 5));
            list3.set(0, list3.get(4));
            list3.set(4, list3.get(0));
            System.out.println(list3);

            System.out.println("======= Question 8 =======");
            ArrayList<Character> list4 = new ArrayList<>();
            for(char i = 'a'; i <= 'z'; i++){
                list4.add(i);
            }
            boolean r = list4.containsAll(Arrays.asList('a', 'c', 'D'));
            System.out.println(r);

            System.out.println("======= Question 9 =======");
            ArrayList<Integer> list5 = new ArrayList<>();
            list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
            for(Integer each : list5){
                if(each % 2 != 0){
                    continue;
                }
                System.out.println(each);
                break;
            }

        }
    }


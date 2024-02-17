package day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,8));
        int max =  Collections.max(list);
        int min =  Collections.min(list);

        System.out.println("max = "+max);//max = 8
        System.out.println("min = "+min);//min = 1

    System.out.println("___________________________________________________");

    ArrayList<String> items = new ArrayList<>();
    items.addAll(Arrays.asList("Eggs","Potato","Milk","Rice"));
    Collections.sort(items);
    System.out.println(items);//[Eggs, Milk, Potato, Rice]
    System.out.println("_____________________________________________");

    Collections.reverse(items);
    System.out.println(items);//[Rice, Potato, Milk, Eggs]

    System.out.println("____________________________________________");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Sveta","Vika","Olga","Vera","Vasiliy","Muhtar"));
        //indexes                      0         1     2       3       4         5
        System.out.println(students);//["Sveta","Vika","Olga","Vera","Vasiliy","Muhtar"]
        Collections.swap(students,0,1);
        System.out.println(students);;//[Vika, Sveta, Olga, Vera, Vasiliy, Muhtar]

        Collections.swap(students,0,students.size()-1);
        System.out.println(students);//[Muhtar, Sveta, Olga, Vera, Vasiliy, Vika]

    System.out.println("______________________________________________");









    }
}

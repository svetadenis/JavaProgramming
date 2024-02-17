package day23_arrayListContinue;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasia");
        names.add("Vasia");
        names.add("Olga");
        names.add("Vika");
        names.add("Masha");

        ArrayList<String>nonDup = new ArrayList<>();
        for (String each:names) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        names = nonDup;
        System.out.println(names);//[Vasia, Olga, Vika, Masha]

        System.out.println("____________________________________________");

        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = list1;

        list1.add(10);
        System.out.println(list1);//[10]
        System.out.println(list2);//[10]

        System.out.println(list1 == list2);//true

        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>();
        l1.add(10);
        System.out.println(l1==l2);        //false. it's two different objects.
        l2.add(10);
        System.out.println(l1==l2);     //still false. it's two different objects. Located in a heap.

        System.out.println(l1.equals(l2)); //true
        System.out.println("___________________________________________");

        ArrayList<Integer>n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList <Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = "+n1);    //    n1 = [10, 20, 30]
        System.out.println("n2 = "+n2);       //  n2 = [30, 10, 20]

        System.out.println(n1.equals(n2));//false, because these two arrays in different order


        System.out.println("_________________________________________________");
        System.out.println(n1.isEmpty());     //false
         System.out.println(n2.isEmpty());    //false

         n1.clear();
         n2.clear();
      System.out.println(n1.isEmpty()); //true
       System.out.println(n2.isEmpty());//true
    }
}

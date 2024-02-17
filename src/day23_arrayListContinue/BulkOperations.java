package day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(numbers);
        System.out.println(list1);//[1, 2, 3, 10, 20, 30, 40]

        list1.addAll(1,numbers);
        System.out.println(list1);//[1, 10, 20, 30, 40, 2, 3, 10, 20, 30, 40]

        System.out.println("____________________________________________________");

        ArrayList<Integer>scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75,85,95,70,80));
        System.out.println(scores);//[75, 85, 95, 70, 80]



        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Vika","Lera","Tania","Olga"));
        System.out.println(students);//[Vika, Lera, Tania, Olga]
//index                                 0      1       2     3
        System.out.println("___________________________________________________");

        students.addAll(2,Arrays.asList("Shukur","Olga","Igor","Anna"));
        System.out.println(students);//[Vika, Lera, Shukur, Olga, Igor, Anna, Tania, Olga]

        System.out.println("___________________________________________________");

       //tranform array in arrayList
        Integer[] nums = {1,2,3,4,5,6,7,8};
        ArrayList<Integer>l1 = new ArrayList<>();
        l1.addAll(Arrays.asList(nums));
        System.out.println(l1);//[1, 2, 3, 4, 5, 6, 7, 8]
//or second options
        Integer[] nums1 = {1,2,3,4,5,6,7,8};
        ArrayList<Integer>l2 = new ArrayList<>(Arrays.asList(nums));
        System.out.println(l2);//[1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("___________________________________________________");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Sveta","Vika","Olga","Vera"));
        System.out.println(employeeList);//[Sveta, Vika, Olga, Vera]

        boolean hasAlena = employeeList.contains("Alena");
        boolean hasVikaOlga = employeeList.containsAll(Arrays.asList("Vika","Olga"));
        boolean hasSvetaLenaMuhtar = employeeList.containsAll(Arrays.asList("Sveta","Muhtar","Lena"));


        System.out.println("hasAlena= "+hasAlena);//false
        System.out.println("hasVikaOlga= "+hasVikaOlga);//true
        System.out.println(hasSvetaLenaMuhtar);//false, because it contains only Sveta, but not Lena and Muhtar


        System.out.println("____________________________________________________");

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));
        list.removeAll(Arrays.asList(10,20));
        System.out.println(list);//[30, 40, 50, 60, 70]
        System.out.println("___________________________________________________");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Sveta","Vika","Olga","Vera","Vasiliy","Muhtar"));
        developers.retainAll(Arrays.asList("Sveta","Vika"));
        System.out.println(developers);//[Sveta, Vika]

        System.out.println("______________________________________________________");

        ArrayList<String>groceriesList = new ArrayList<>();
        groceriesList.addAll(
                Arrays.asList("Eggs","Potato","Milk","Rice","Strawberry")
        );
        groceriesList.retainAll(Arrays.asList("Eggs","Potato","Milk"));
        System.out.println(groceriesList);//[Eggs, Potato, Milk]

        System.out.println("_______________________________________________________");

        groceriesList.removeAll(Arrays.asList("Potato"));
        System.out.println(groceriesList);//[Eggs, Milk]

        System.out.println("________________________________________________________");





    }
}

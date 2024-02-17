package day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array[0] = 100;
        System.out.println(Arrays.toString(array));
System.out.println("________________________________________________");

ArrayList<String> groceriesList = new ArrayList<>();
groceriesList.add("Eggs");
groceriesList.add("paper Towels");
groceriesList.add("apples");
groceriesList.add("olive oil");

System.out.println(groceriesList);//[Eggs, paper Towels, apples, olive oil]

System.out.println("__________________________________________________");
groceriesList.set(2,"Oranges");
System.out.println(groceriesList);//[Eggs, paper Towels, Oranges, olive oil]

System.out.println("_____________________________________________________");

groceriesList.remove(0);
System.out.println(groceriesList);

groceriesList.remove("olive oil");//[paper Towels, Oranges, olive oil]
System.out.println(groceriesList);//[paper Towels, Oranges]

System.out.println("_______________________________________________");

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);//0
numbers.add(20);//1
numbers.add(30);//2
numbers.add(40);//3
numbers.add(50);//4

//umbers.remove(20);  error, we don't have index 20
numbers.remove(Integer.valueOf(20));
System.out.println(numbers);//[10, 30, 40, 50]
//we can remove object as boolean as well
// boolean r1 = numbers.remove(Integer.valueOf(20));
//System.out.println(r1);

System.out.println("________________________________________________");

numbers.clear();
System.out.println(numbers);
System.out.println("__________________________________________________");

    ArrayList<String>names = new ArrayList<>();
    names.add("Vasia");
    names.add("Vasia");
    names.add("Olga");
    names.add("Vika");
    names.add("Masha");

    System.out.println(names.indexOf("Vasia"));//0
    System.out.println(names.lastIndexOf("Vasia"));// 1

    //unique name

    for (String each:names){
        if(names.indexOf(each) == names.lastIndexOf(each))     {
            System.out.println(each);     //    Olga  Vika Masha
        } }

    //if I want to find just only first unique name, use break statement
     for (String each:names){
         if(names.indexOf(each) == names.lastIndexOf(each))     {
             System.out.println(each);     //    Olga
             break;
         } }

      boolean hasMuhtar = names.contains("Muhtar")  ;    //false
     boolean hasVika = names.contains("Vika"); //true



    }
}

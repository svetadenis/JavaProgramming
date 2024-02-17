package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Java"));

        System.out.println(names);//[Java, Java, Java, C#, C#, Ruby, Swift, Java]

      for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i,"Python");
            }
        }

      System.out.println(names);//[Python, Python, Python, C#, C#, Ruby, Swift, Python]

//Oe second method:
    Collections.replaceAll(names,"Java","Python");
    System.out.println(names);//[Python, Python, Python, C#, C#, Ruby, Swift, Python]

//to avoid sensibility (lowCase, highCase)
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equalsIgnoreCase("Java")){
                names.set(i,"Python");
            }
        }
    System.out.println(names);//[Python, Python, Python, C#, C#, Ruby, Swift, Python]

    System.out.println("______________________________________________________");

    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(Arrays.asList(10,20,30,40,50,50,50,50,60,60));

    int count = Collections.frequency(list,50);
    System.out.println(count);//4

    System.out.println("__________________________________________________");

    ArrayList<String> words = new ArrayList<>();
    words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Java"));

    int countJava = Collections.frequency(words,"Java");
    System.out.println(countJava);//4
    System.out.println("________________________________________________");

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.addAll(Arrays.asList(10,20,30,40,50,50,50,50,60,60));

        for (Integer each:numbers) {
            if(Collections.frequency(numbers,each)==1){
                System.out.println(each);//10 20 30 40
            }

        }

    }

}

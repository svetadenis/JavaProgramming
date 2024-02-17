package day40_collections;

import java.util.*;

public class IterablePractice1 {

public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(Arrays.asList(10));

    Iterator<Integer> iterator = list.iterator();

    System.out.println(iterator.hasNext());
    System.out.println(iterator.next());
//true
//10

    System.out.println("-----------------------------------");

    List<String> names = new ArrayList<>();
    names.addAll(Arrays.asList(
            "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
    ));

    Iterator<String> it = names.iterator();

    while (it.hasNext()) {
        String each = it.next();
        if (each.equalsIgnoreCase("ahmed")) {
            it.remove();
        }
    }

    System.out.println(names);
  //  [John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]
    System.out.println("--------------------------------------------------------------------");


    List<String> names2 = new ArrayList<>();
    names2.addAll(Arrays.asList(
            "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
    ));
    names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));
    System.out.println(names2);
// This is a lambda expression that defines the condition for removal. The lambda expression takes an argument p
// (representing each element in the list) and checks if it is equal to "ahmed" in a case-insensitive manner using
// equalsIgnoreCase().
    System.out.println("--------------------------------------------------------------------");


    List<Integer> numbers = new ArrayList<>();
    numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    // find the nth largest number

    int n = 5;
    for (int i = 0; i < n - 1; i++) {
        numbers.removeIf(p -> Collections.max(numbers) == p);
    }
    int max = Collections.max(numbers);
    System.out.println(max);
}
}
/*
true
10
-----------------------------------
[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]
--------------------------------------------------------------------
[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]
--------------------------------------------------------------------
5
 */
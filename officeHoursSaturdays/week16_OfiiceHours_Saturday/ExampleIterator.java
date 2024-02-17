package week16_OfiiceHours_Saturday;

import java.util.*;

public class ExampleIterator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 6, 8, 7, 5, 2, 4, 12, 5, 2));
        // ArrayList is a Iterable? yes

        // use this method to see all the elements of a collection
        list.forEach(System.out::println);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            if(it.next() % 2 == 0){
                it.remove();
            }
        }

        System.out.println(list);

//        for(int each : list){
//            if(each % 2 == 0){
//                list.remove(each);
//            }
//        }

        Cool<String> cool = new Cool<>();
        cool.run("hello");

        Cool<Integer> cool2 = new Cool<>();
        cool2.run(10);

        List<Integer> nums = List.of(3, 21, 5, 124, 24); // this is immutable, quick way (less code) to define a List

    }
}

class Cool<J> {
    public void run(J j){
        System.out.println(j);
    }
}
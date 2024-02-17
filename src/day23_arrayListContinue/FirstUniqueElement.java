package day23_arrayListContinue;

import java.util.ArrayList;
public class FirstUniqueElement {
    public static  void main(String[] args) {

    ArrayList<Integer>list = new ArrayList<>();
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(4);
    list.add(3);

    System.out.println(list);//[1, 1, 2, 3, 3, 4, 3]

        for (Integer element : list) {//1
            int frequency = 0;
        for (Integer each:list){
            if (each == element) {
                frequency++;
            }
        }
        if(frequency == 1){
            System.out.println(element);
            break;//2
        }
    }}}

/*if i'm looking for every single unique element, do not use break
if(frequency == 1){
            System.out.println(element);//2,4
 */






/*
 Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
 */
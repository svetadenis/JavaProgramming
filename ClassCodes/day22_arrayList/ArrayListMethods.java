package day22_arrayList;

import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {

    //we can add dublicate lists as well
    ArrayList<Integer>list = new ArrayList<>();
    list.add(10);
    System.out.println(list);//[10]
    list.add(20);
    System.out.println(list);//[10, 20]
    list.add(30);
    System.out.println(list);//[10, 20, 30]
    list.add(10);
    System.out.println(list);//[10, 20, 30, 10]
//indexes                        0   1  2    3
    list.add(1,15);
    System.out.println(list);//[10, 15, 20, 30, 10]
    list.add(2,25);
    System.out.println(list);//[10, 15, 25, 20, 30, 10]

    System.out.println("_____________________________________________________");

    ArrayList<String> studentsList = new ArrayList<>();
    studentsList.add("Mohammed");
    studentsList.add("Misha");
    studentsList.add("Olya");
    studentsList.add("Vika");

    System.out.println(studentsList.size());//4
    System.out.println(studentsList);//[Mohammed, Misha, Olya, Vika]

    String firstStudent= studentsList.get(0);
    System.out.println(firstStudent);//Mohammed

    String lastStudent = studentsList.get(studentsList.size() - 1);
    System.out.println(lastStudent);//Vika




    }
}

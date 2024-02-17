package week9_OfficeHours_Saturday;

import java.util.Arrays;

public class QuizWeek9Arrays {
    public static void main(String[] args) {

        int wd = 0;
        String[] days = {"Sun", "Mon", "Wed", "Sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "Sat":
                case "Sun":
                    wd = wd - 1;
                    break;
                case "Mon":
                    wd = wd + 1;
                case "Wed":
                    wd = wd + 2;
            }

            System.out.println(wd);//-1 243
        }
            System.out.println("______________________________________________________");

        int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4, 5};
        num1 = num2;
        for (int i1 = 0; i1 < num2.length; i1++) {
            System.out.println(num1[i1]);//12345
            System.out.println("_____________________________________________________");

        }
        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));//[15, 30, 75, 60, 90]
            System.out.println("____________________________________________________");



    int[] arr2 = {1, 2, 3, 4};
    int i = 0;
    do {
        System.out.println(arr2[i] + "");
        i++;
    } while (i < arr2.length);//1234
        System.out.println("__________________________________________________________");

        char[] array ={'D','C','B','A'};
        Arrays.sort(array);
        for(char each:array) {
            System.out.println(each+"");
            if(each=='D'){
                continue;//ABCD
            }
        }




        }}
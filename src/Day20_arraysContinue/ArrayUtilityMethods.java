package Day20_arraysContinue;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
        int[] score = {70,100,80,90,65};
        System.out.println(Arrays.toString(score));//[70, 100, 80, 90, 65]

    String result = Arrays.toString(score);
    System.out.println(result);//[70, 100, 80, 90, 65]
System.out.println("__________________________________________________________");

int[] a1 = {1,2,3,4,5};
int[] a2 = {1,2,3,4,5};

boolean r1 = Arrays.equals(a1, a2);//equals checks if both the arrays are equal or not
System.out.println(r1);//true

char[] ch1 = {'A','B','C'};
char[] ch2 = {'A','B','C'};

boolean r2 = Arrays.equals(ch1,ch2);
System.out.println(r2);//true

String[] s1 = {"A", "B", "C"};
String [] s2 = {"A", "B", "C"};

System.out.println(Arrays.equals(s1,s2));//true

System.out.println("______________________________________________________");

int[] nums = {100,80,90,75,88,99,0,5,4};
Arrays.sort(nums);
System.out.println(Arrays.toString(nums));//[0, 4, 5, 75, 80, 88, 90, 99, 100]

System.out.println("_______________________________________________");

System.out.println(Arrays.toString(nums));
System.out.println("Minimum number"+nums[0]);//0
System.out.println("Maximum number"+nums[nums.length-1]);//100
       //Sort means to sort from smallest to largest, so the first index is the smallest
        //max number is last index

System.out.println("_______________________");

String[] b1 = {"A","C","B"};
String[] b2 = {"B","A","C"};

Arrays.sort(b1);//b1 = {A,B,C}
Arrays.sort(b2);//b2 = {A,B,C}

System.out.println(Arrays.equals(b1, b2));//true
System.out.println("_____________________________________________");

String[] students = {"Sveta", "Vika", "Misha"};
System.out.println(Arrays.toString(students));//[Sveta, Vika, Misha]
Arrays.sort(students);
System.out.println(Arrays.toString(students));//[Misha, Sveta, Vika] the smaller numbers from the AScii tables printed first


System.out.println("__________________________________________");

int[] array = {10,20,30,40,50,60,70};
int [] array2 = Arrays.copyOf(array,7);
System.out.println(Arrays.toString(array2));//[10, 20, 30, 40, 50, 60, 70]


int[] array3 = {10,20,30,40,50,60,70};
int [] array4 = Arrays.copyOf(array,10);
System.out.println(Arrays.toString(array4));    //  [10, 20, 30, 40, 50, 60, 70, 0, 0, 0]

System.out.println("_____________________________________________");

int[] n1 = {1,2,3,4,5};
int[] n2 = {6,7,8,9,10,11,12};

int[] n3 = Arrays.copyOf(n1,n1.length + n2.length);
System.out.println(Arrays.toString(n3));      // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]
for (int i = 0, j=n1.length;i<n2.length;i++,j++){
    n3[j]=n2[i];
}
System.out.println(Arrays.toString(n3));   //   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

System.out.println("____________________________________________________");

char[] ch = {'A','B','C','D','E','F','G'};
//index:      0   1   2   3   4    5  6

char[] result1 = Arrays.copyOf(ch,4);
System.out.println(Arrays.toString(result1));     //       [A, B, C, D]

char[] result2 = Arrays.copyOfRange(ch,2,4);
System.out.println(Arrays.toString(result2));      //   [C, D]

char[] result3 = Arrays.copyOfRange(ch,2,ch.length);
System.out.println(Arrays.toString(result3));



}}

package day22_arrayList;

public class MaxMinNumberofMultiArray {
    public static void main(String[] args) {
 //index of elements 0   1   2    0   1   2      0   1  2
    int[][] array={{100,200,300},{10,1000,50},{-200,400,0}};//indexes of array:0~2
     //index of 1D      0            1             2

    int max = array[0][0];
    int min = array [0][0];
//[index of array] [index of element in an array]
        for (int[]each1D:array) {
            for (int eachElement : each1D) {
                if(eachElement>max){
                    max=eachElement;
                }
                if(eachElement<min){
                    min=eachElement;
                }
            }
        }
    System.out.println("Maximus number is "+max);//Maximus number is 1000
    System.out.println("Minimum number is "+min);//Minimum number is -200
    }
}

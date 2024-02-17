package day19_array;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String[] myGroup = new String[5];//created string array
       // left and right sides must be string
        //you can't make new int [5] if you have String on the left side
        myGroup[0]="Asia";
        myGroup [myGroup.length-1]= "Ulia";//from last index of my array
        System.out.println(Arrays.toString(myGroup));//Asia, nul,nul,nul,Ulia
        myGroup[2] = "Olya";
        myGroup[3] = "Misha";
        System.out.println(Arrays.toString(myGroup));//Asia,null,Olya,Misha,Ulia

        myGroup[1] = "Sveta";
        System.out.println(Arrays.toString(myGroup));//Asia,Sveta,Olya,Misha,Ulia
        System.out.println("__________________________________________");

        //print the elements in the array in a reverse order
        for (int i = myGroup.length-1;i>=0;i--){
            //the loop continues until 0 index, thats why i>=0
            System.out.println(myGroup[i]);//Asia, Sveta, Olya, Misha, Ulia
        }
        System.out.println("____________________________________________");


        //myGroup.fori   enter short cut for loop
        //  for (int i = 0; i < myGroup.length; i++) {
            
        }

    }


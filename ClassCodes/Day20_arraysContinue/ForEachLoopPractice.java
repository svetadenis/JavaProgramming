package Day20_arraysContinue;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int each:numbers){
            if(each%2 !=0){
                System.out.println(each);//1 3 5 7 9
            }
        }
System.out.println("________________________________________________");

        int[] nums = {100,20,30,40,5,4,3,2,1,1000,300};
        int max = nums[0];
        int min = nums[0];
        for(int each:nums){
            if(each>max){
                max=each;
            }
        if(each<min){
            min=each;
        }
        }
        System.out.println("max = "+max);      //max=1000
        System.out.println("min = "+min);      //min=1
        System.out.println("___________________________________________________________");

        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100,110,120};

        int[] a3 = new int[a1.length+a2.length];
        int k = 0;
        for(int each:a1){
            a3[k++] = each;
        }
        for (int each:a2){
            a3[k++] = each;
        }
        System.out.println(Arrays.toString(a3));      // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120]


        System.out.println("_____________________________________________________________");

        String[] names = {"Svetlana Denisenko", "Vasiliy Gladkov", "Genry Pupkov"};
        for (String each:names){
            System.out.print(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));   // S.DV.GG.P
        }
        System.out.println("_______________________________________________________");
        
        String[] names1 = {"Svetlana Denisenko", "Vasiliy Gladkov", "Genry Pupkov"};

     for (String each : names1) {
      // Find the index of the last space in the name
      int lastSpaceIndex = each.lastIndexOf(" ");

    // Check if the last space is found
    if (lastSpaceIndex != -1) {//if space is not found
    // Extract the first initial and the initial after the last space
    char firstInitial = each.charAt(0);
    char lastInitial = each.charAt(lastSpaceIndex + 1);

        // Print the initials with a space in between
        System.out.print(firstInitial + "." + lastInitial+" ");   //    S.D V.G G.P
    }
}                  }            }

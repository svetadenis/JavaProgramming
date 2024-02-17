package day19_array;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {100,20,500,-10,30};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {//second element will be compare with the first element
            //and which one is greater will be assign to max, etc with third element, fourth and fifth
            if(numbers[i]>max){
                max = numbers[i];

            }
        }
        System.out.println("max = "+max);//500

    }
}

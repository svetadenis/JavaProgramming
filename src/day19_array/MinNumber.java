package day19_array;

public class MinNumber {

        public static void main(String[] args) {
            int[] numbers = {100,20,500,-10,30};
            int min = numbers[0];//assume that first element is minimum number

            for (int i = 1; i < numbers.length; i++) {//second element will be compare with the first element
                //and which one is greater will be assign to max, etc with third element, fourth and fifth
                if(numbers[i]<min){
                    min = numbers[i];

                }
            }
            System.out.println("min = "+min);//-10
    }
}

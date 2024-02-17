package day15_whileLoop;

public class SumEvenNumber {
    public static void main(String[] args) {

        for (int i=50; i<101; i++){//solution1
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //50,52,54,56...100
    for(int i=50; i<101; i+=2) {//solution 2
        System.out.print(i+" ");
    }
        System.out.println();

    for (int i=50; i<101; i++){//solution 3
        if(i%2 !=0){//if the i's value is odd number
            continue;// skip it
        }
        System.out.print(i+" ");
    }
        System.out.println();
    }
}



//sum of even number between 50 ~100
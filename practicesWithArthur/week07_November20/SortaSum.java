package week07_November20;

public class SortaSum {
    public static void main(String[] args) {

        System.out.println(sortaSum(7, 6));

    }

    public static int sortaSum(int a, int b) {

        int sum = a+b;
        return (sum>9 && sum<20)? 20 : sum;


    }

// if (sum>9 && sum<20){
//   return 20
// } return sum;

}


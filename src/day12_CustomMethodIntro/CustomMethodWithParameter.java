package day12_CustomMethodIntro;
public class CustomMethodWithParameter {
    public static void main(String[] args) {
        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

        int num3 = 40;
        oddOrEven(num3);

        int num4 = 79;
        oddOrEven(num4);

        /*oddOrEven(5);

        oddOrEven(100);*/
    }
    //the method takes an argument number, and verifies if the number is odd or even number
    public static void oddOrEven(int number){
                                //parameter
        if(number %2==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " s odd number");
        }

     //____________________________________________________

        //creat a method that check if a person is eligible to buy alcohol

    }


}

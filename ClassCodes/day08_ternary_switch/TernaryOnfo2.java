package day08_ternary_switch;

public class TernaryOnfo2 {
    public static void main(String[] args) {

        int number = 100;

    /*    String result = "";
        if (number > 0) {
            result = "Positive";
        }else if (number <=0) {
                result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);*/

    String result = (number>0) ? "Positive" :(number <0) ? "Negative": "Zero";
        System.out.println(result);
        System.out.println("________________________________________");


    }
}

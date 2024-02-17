package week10_December11th;

public class FirstTwo {
    public static void main(String[] args) {
        System.out.println(firstTwo("Cydeo"));
    }
    public static String firstTwo(String str) {

        //solution1
        // if(str.length()>=2){
        //   return  str.substring(0,2);
        // } return str;


        //solution2
        return str.length()>=2 ? str.substring(0,2) : str;
    }

}


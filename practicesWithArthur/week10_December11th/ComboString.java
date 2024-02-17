package week10_December11th;

public class ComboString {
    public static void main(String[] args) {
        System.out.println(comboString("run", "Arthur"));
    }
    public static String comboString(String a, String b) {

        //solution1
        // String small;
        // String big;

        // if (a.length()<b.length()){
        //   small=a;
        //   big= b;
        // }else{
        //   small=b;
        //   big=a;
        // }

        // return small+big+small;

        //solution2
        return a.length()>b.length()? b+a+b : a+b+a;
    }

}


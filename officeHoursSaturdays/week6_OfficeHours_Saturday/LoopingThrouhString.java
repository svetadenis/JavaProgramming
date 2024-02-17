package week6_OfficeHours_Saturday;

public class LoopingThrouhString {
    public static void main(String[] args) {

        String str = "java";
        // print each char  -> not proper way
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        // proper way to iterate through a String

        for(int i = 0; i < str.length(); i++) { // i <= str.length() -1
            // the i variable will help us represent the indexes
            System.out.println(str.charAt(i));
        }

    }
}


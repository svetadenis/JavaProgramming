package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {
        double n1 = 10.587654;
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println(df.format(n1));//10.6
    }
}

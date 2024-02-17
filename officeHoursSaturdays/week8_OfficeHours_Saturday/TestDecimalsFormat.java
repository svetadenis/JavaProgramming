package week8_OfficeHours_Saturday;

import java.text.DecimalFormat;
public class TestDecimalsFormat {
    public static void main(String[] args) {

        double n = 3123124124.1392400;
        DecimalFormat df = new DecimalFormat("0,000.00");
        System.out.println(df.format(n));

        double n2 = 13.311003;
        DecimalFormat df2 = new DecimalFormat("00.###");
        System.out.println(df2.format(n2));
        System.out.println(df2.format(n2) + 10);

        DecimalFormat df3 = new DecimalFormat("00%");
        System.out.println(df3.format(n2));
        System.out.println(df3.format(0.5));

    }
}


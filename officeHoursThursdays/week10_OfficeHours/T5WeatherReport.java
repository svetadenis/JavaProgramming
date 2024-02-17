package week10_OfficeHours;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T5WeatherReport {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>(Arrays.asList(62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5));
        Collections.sort(temperatures);

        // remove the smallest two
        temperatures.remove(0);
        temperatures.remove(0);
        // remove the biggest two
        temperatures.remove(temperatures.size() - 1);
        temperatures.remove(temperatures.size() - 1);

        System.out.println(temperatures);

        System.out.println("Max: " + temperatures.get(temperatures.size() - 1)); // if you sorted
        System.out.println("Max: " + Collections.max(temperatures));
        System.out.println("Min: " + temperatures.get(0)); // if you sorted
        System.out.println("Min: " + Collections.min(temperatures));
        System.out.println("Median/middle: " + temperatures.get(temperatures.size() / 2));
        double sum = 0;
        for(double each : temperatures){
            sum += each;
        }
        double avg = sum / temperatures.size();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Mean/avenge " + df.format(avg));
        System.out.println("predication: " +  (int)(avg - 5) + " - " + (int)(avg + 5));
    }
}
/*

T5WeatherReport [ArrayList, loop, operators]

Create a program that will define an ArrayList of recent temperatures. There is always extreme temperatures so to get a better reading of the data remove the highest 2 and lowest 2 temperatures. Then give the following information based on the temperature:

max temperature, min temperature, median (middle temperature), mean (average temperature)

lso, give a prediction temperature range for the next few days by using the average and both adding and subtracting 5 to create the range. The values for this predication can be whole numbers

we can assume the amount of data will always be an odd number so there will be one median

    Ex:
    input:
    62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5

    // excluded: 42.3, 43.0, 68.9, 77.3
    // data sample: 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1

    output:
    max: 62.1
    min: 44.8
    median: 53.4
    mean: 52.44
    predication: 47 - 57
 */
package week9OfficeHours;
import java.util.Arrays;
public class BeginningEnd {
    public static void main(String[] args) {

        String[] names = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
        int count = 0;
        String validNames = "";

        for(String each : names){ // each == names[i]
            each = each.toLowerCase();
            if(each.charAt(0) == each.charAt(each.length() - 1)){ //if(each.endsWith(each.substring(0,1)))
                count++;
                validNames += capitalize(each) + ", ";
            }
        }

        System.out.println(count);
        System.out.println(validNames.substring(0, validNames.length() - 2));
        // getting an array of valid name
        String[] validArr = validNames.split(", ");
        System.out.println(Arrays.toString(validArr));

    }

    public static String capitalize(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
/*
T5BeginningEnd [array, loop, String]

    Create a program that will define a String array with some name values. Determine how many of the names begin with and end with the same character.

    Ex:
        {Anna, Mike, Aliya, Remus, Gina, Hannah, Nathan, Otto, Kevin, Kelly}

        -> 5

    Bonus challenge: Collect all the names into a String
 */


package week7_OfficeHours_Saturday;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabcccda";
        String result = "";

        for(int i = 0; i < str.length(); i++){ // read every character from the String
            int count = 0; // every time the outer loop runs, the counter resets
            if(!result.contains("" + str.charAt(i))) {
                for (int j = i; j < str.length(); j++) { // purpose of this loop is to count
                    System.out.println(str.charAt(i) + " == " + str.charAt(j));
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                result += str.charAt(i) + "" + count;
            }
        }

        System.out.println(result);

//        for(int i = 0; i < str.length(); i++){ // read every character from the String
//            System.out.println("checking char " + str.charAt(i));
//            if(!result.contains("" + str.charAt(i))) {
//                for (int j = 0; j < str.length(); j++) {
//                    System.out.println(str.charAt(i) + " == " + str.charAt(j));
//                }
//                result += str.charAt(i);
//            }
//        }


//        for(int i = 0; i < str.length(); i++){ // read every character from the String
//            System.out.println("checking char " + str.charAt(i));
//
//            if(result.contains("" + str.charAt(i))){
//                continue;
//            }
//
//            for(int j = 0; j < str.length(); j++){
//                System.out.println(str.charAt(i) + " == " + str.charAt(j));
//            }
//
//            result += str.charAt(i);
//        }
    }
}
/*
[IQ] Frequency of Characters [nested loop, String]

	create a program that can find the frequency of each character from a string

			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */


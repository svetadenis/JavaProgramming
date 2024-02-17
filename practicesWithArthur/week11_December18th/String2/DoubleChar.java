package week11_December18th.String2;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(DoubleChar("Cydeo"));
    }

    public static String DoubleChar(String str) {
        //solution1(a for loop)
        // String result="";
        // for(int i=0; i<str.length(); i++){
        //   result+=str.charAt(i);
        //   result+=str.charAt(i);
        // }
        // return result;

        //solution2 (nested loop)

        /*real life example to understand nested loop very well:
        https://github.com/arthur-rule/Avengers_Sessions_Extra_Sources/blob/master/src/Java/Extra_Sources/Java/Loop/fiveLapsThreePush_Ups.java
        */
//         String result = "";
//               for(int i=0; i<str.length(); i++){
//                   for (int j=0; j<2;j++) {
//                       result += str.charAt(i);
//                   }
//
//               }
//               return result;

        //solution3(with repeat() method)
  /*
  repeat() method explanation:
  https://github.com/arthur-rule/Avengers_Sessions_Extra_Sources/blob/master/src/Java/Extra_Sources/Java/Method/repeatMethod.java
  */


        //solution3
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += ("" + str.charAt(i)).repeat(2);

        }
        return result;

    }}



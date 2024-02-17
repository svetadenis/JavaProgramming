package week10_December11th;

public class ExtraEnd {
    public static void main(String[] args) {

        System.out.println(ExtraEnd("abcd"));
    }
    public static String ExtraEnd(String str) {

        //solution1
        // return str.substring(str.length()-2,str.length()) +
        //       str.substring(str.length()-2,str.length()) +
        //       str.substring(str.length()-2,str.length());

//solution2
// String last2 = str.substring(str.length()-2,str.length());
// return last2+last2+last2;

//solution3
//        String last2 = str.substring(str.length()-2);
//        return last2+last2+last2;

//solution4
//        String last2 = (str.length()>=2)? str.substring(str.length()-2) : str;
//        return (str.length()>=2)? last2+last2+last2 : str;

//solution5
        String last2 = (str.length()>=2) ? str.substring(str.length()-2) : str;
        return  last2.repeat(3);

    }
}

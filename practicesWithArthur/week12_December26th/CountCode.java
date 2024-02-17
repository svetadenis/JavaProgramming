package week12_December26th;

public class CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("Which is better clean code or dirty but fast code?"));
    }
    public static int countCode(String str) {
        //solution1(substring().equals() methods)
        // int counter=0;
        // for(int i=0; i<str.length()-3;i++){
        // if (str.substring(i,i+2).equals("co")&&str.substring(i+3,i+4).equals("e")){
        //   counter++;
        // }
        // }
        // return counter;

        //solution2(substring().compareTo() method)
        // int counter=0;
        // for(int i=0; i<str.length()-3;i++){
        // if (str.substring(i,i+2).compareTo("co")==0 &&str.substring(i+3,i+4).compareTo("e")==0){
        //   counter++;
        // }
        // }
        // return counter;

        //solution3(charAt() method)
        // int counter=0;
        // for(int i=0; i<str.length()-3;i++){
        // if (str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e'){
        //   counter++;
        // }
        // }
        // return counter;

        //solution4(matches() method with [a-z])
//         int counter=0;
//         for(int i=0; i<str.length()-3;i++){
//         if (str.substring(i,i+4).matches("co[a-z]e")){
//           counter++;
//         }
//         }
//         return counter;

        //solution5(matches() method with .)
        int counter=0;
        for(int i=0; i<str.length()-3;i++){
            if (str.substring(i,i+4).matches("co.e")){
                counter++;
            }
        }
        return counter;
    }
}

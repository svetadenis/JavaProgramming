package day16_LoopContinue;

public class NestedLoopPractice {
    public static void main(String[] args) {
//                    0123456789.......
        String str = "aaabbccccddeeeeff";
        String result = "";//"bdf"

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);//each character of str
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (count == 2 && (!result.contains("" + ch))) {//(!result.contains("" + ch) to avoid bbddff
                result += ch;
            }
        }
   /*  char ch = str.charAt(0);
        int count = 0;
        for (int i=0; i<str.length();i++){
            if(str.charAt(i)==ch){//if any character in a string equvalent 0 character "a"
                count++;*/

        System.out.println(result);

    }
}
/*
внешний цикл выбирает букву для сравнения, внутренний цикл сравнивает ее с другими буквами в строке
 */




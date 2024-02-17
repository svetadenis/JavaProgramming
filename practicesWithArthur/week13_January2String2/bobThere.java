package week13_January2String2;

public class bobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("Bob Dylan stays in b&b."));
    }
    public static boolean bobThere(String str) {
        //solution1(substring() method and regular if statement)
        // Boolean bob=false;
        // for(int i=0; i<str.length()-2;i++){
        // if (str.substring(i,i+1).equals("b")&&str.substring(i+2,i+3).equals("b")){
        //   bob=true;
        // }
        // }
        // return bob;

        //solution2(substring() method and ternaries)
        // Boolean bob=false;
        // for(int i=0; i<str.length()-2;i++){
        // bob=(str.substring(i,i+1).equals("b")&&str.substring(i+2,i+3).equals("b"))? true : bob;
        //   }
        // return bob;

        //solution3(charAt() method)
        // Boolean bob=false;
        // for(int i=0; i<str.length()-2;i++){
        // bob=(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')? true : bob;
        //   }
        // return bob;


        //solution4(If you need index number you should normally use for loop but
        //we have actually one option for using While loop for this puzzle:)
        Boolean bob=false;
        int i = 0;
        while(i < str.length()-2) {
            bob=(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')? true : bob;
            ++i;
        }
        return bob;
    }
}

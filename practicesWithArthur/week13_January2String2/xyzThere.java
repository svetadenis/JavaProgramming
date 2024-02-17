package week13_January2String2;

public class xyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("xyz.abc"));
    }
    public static boolean xyzThere(String str) {

        //solution1

        Boolean match=false;
        str=str.replace(".xyz","");
        for(int i=0; i<str.length()-2;i++){
            match=(str.substring(i,i+3)).equals("xyz") ? true : match;
        }
        return match;

        //solution2
        // boolean match =false;
        // if(str.replace(".xyz","").contains("xyz")){
        //   match=true;
        // }
        // return match;

        //solution3
        //return str.replace(".xyz","").contains("xyz");

    }
}


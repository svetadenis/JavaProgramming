package week11_December18th.String1;

public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redline"));
    }
    public static String seeColor(String str) {

        //solution1(substring() method)
        // if(str.length()>=3 &&str.substring(0,3).equals("red")) {
        //   return "red";
        // }else if(str.length()>=4 &&str.substring(0,4).equals("blue")){
        //   return "blue";
        // }else return "";

        //solution2(startsWith() Method )
        // if (str.startsWith("red"))
        //   return "red";
        // if (str.startsWith("blue"))
        //   return "blue";
        // else
        //   return "";

        //solution3(direct return)
        // return str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : "";

        //solution4(indexOf() Method)
        return str.indexOf("red")==0 ? "red" : str.indexOf("blue")==0 ? "blue" : "";



    }

}


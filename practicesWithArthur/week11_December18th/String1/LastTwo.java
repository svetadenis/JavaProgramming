package week11_December18th.String1;

public class LastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("Annie Ernaux"));

    }
    public static String lastTwo(String str) {

        //solution1
        // if (str.length() < 2)
        //   return str;
        // else
        //   return str.substring(0, str.length()-2) +
        //         str.charAt(str.length()-1) +
        //         str.charAt(str.length()-2);

        //solution2
        return str.length()>=2?
                str.substring(0,str.length()-2)+
                        str.charAt(str.length()-1)+
                        str.charAt(str.length()-2)
                : str;
    }

}


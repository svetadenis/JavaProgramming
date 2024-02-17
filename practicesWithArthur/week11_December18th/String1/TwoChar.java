package week11_December18th.String1;

public class TwoChar {
    public static void main(String[] args) {
        System.out.println(twoChar("Aldous Huxley", 7));
    }

    public static String twoChar(String str, int index) {

        //solution1
        if (str.length()<index+2 || index<0)

            return str.substring(0,2);
        return str.substring(index,index+2);

        //solution2(ternaries)
        //return (str.length()-index<2 || index<0)? str.substring(0,2) : str.substring(index,index+2);

    }
}


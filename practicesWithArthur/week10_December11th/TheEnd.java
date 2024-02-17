package week10_December11th;

public class TheEnd {
    public static void main(String[] args) {

        System.out.println(theEnd("Stanley Kubrick", true));
    }

    public static String theEnd(String str, boolean front) {

        // solution
        // return front? str.substring(0,1) : str.substring(str.length()-1);

        //solution2
        return front? ""+str.charAt(0) : ""+str.charAt(str.length()-1);
    }
    }



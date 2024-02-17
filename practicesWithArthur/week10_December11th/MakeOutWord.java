package week10_December11th;

public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Arthur"));

    }
    public static String makeOutWord(String out, String word) {

        //Solution1(hardcoding)
        //return "" + out.charAt(0) + out.charAt(1) + word + out.charAt(2) + out.charAt(3);

        //solution2
        //return out.substring(0,2)+word+out.substring(2,4);

        //solution3 (actuallyno need to specify last index of out )
        //return out.substring(0,2)+word+out.substring(2);

        //solution4(if we do not know length of out)
        // int midOut=out.length()/2;
        // return out.substring(0,midOut)+word+out.substring(midOut);

        //solution5(if the length of out is not even)
        int midOut=(out.length()%2==0)? out.length()/2 : out.length()/2+1 ;
        return out.substring(0,midOut)+word+out.substring(midOut);
    }

}


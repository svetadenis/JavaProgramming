package week13_January2String2;

public class endOther {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
    }
    public static boolean endOther(String a, String b) {
        //solution1(compareTo() method
        // a=a.toLowerCase();
        // b=b.toLowerCase();
        // int aLen = a.length();
        // int bLen = b.length();
        // return aLen<=bLen&&a.compareTo(b.substring(bLen-aLen))==0 ||
        // bLen<=aLen&&b.compareTo(a.substring(aLen-bLen))==0;

        //solution2(substring().equals methods)
        // a=a.toLowerCase();
        // b=b.toLowerCase();
        // int aLen = a.length();
        // int bLen = b.length();
        // return aLen<=bLen&&a.equals(b.substring(bLen-aLen)) ||
        // bLen<=aLen&&b.equals(a.substring(aLen-bLen));

        //solution3(substring().equalsIgnoreCase methods no reassigning strings)
        // int aLen = a.length();
        // int bLen = b.length();
        // return aLen<=bLen&&a.equalsIgnoreCase(b.substring(bLen-aLen)) ||
        // bLen<=aLen&&b.equalsIgnoreCase(a.substring(aLen-bLen));

        //solution4(endsWith() method)
        // a=a.toLowerCase();
        // b=b.toLowerCase();
        // return a.endsWith(b) || b.endsWith(a);

        //solution5(endsWith() method no reassigning strings)
        return a.toLowerCase().endsWith(b.toLowerCase()) ||
                b.toLowerCase().endsWith(a.toLowerCase());

    }
}

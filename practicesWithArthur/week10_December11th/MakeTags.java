package week10_December11th;

public class MakeTags {
    public static void main(String[] args) {
        System.out.println(makeTags("html", "Cydeo Bootcamp"));

    }
    public static String makeTags(String tag, String word) {

        return "<"+tag+">"+word+"</"+tag+">";
    }
    }


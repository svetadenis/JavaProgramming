package week5_OfficeHours_Saturdays;

public class IndexOfExample {
    public static void main(String[] args) {

        // Q: how can I find the 2nd, 3rd , etc of a character
        //            0123456789
        String str = "definition";
        System.out.println(str.indexOf('i')); // gives the first occurrence
        System.out.println(str.lastIndexOf('i')); // gives the last occurrence

        System.out.println(str.indexOf('i', 4));
        System.out.println(str.indexOf('i', 6));

        int first = str.indexOf('i');
        int second = str.indexOf('i', first + 1);
        int third = str.indexOf('i', second + 1);

        System.out.println(str.indexOf('z'));

        // when you call indexOf with a String arg, it looks for the character sequence and then it returns the index of the first character in that sequence
        System.out.println(str.indexOf("it"));
        System.out.println(str.indexOf("fin"));
        System.out.println(str.indexOf("oy"));

        System.out.println(str.indexOf('f') == str.lastIndexOf('f')); // checking if the f is in same position, meaning there is only one

    }
}


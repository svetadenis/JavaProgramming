package utilities;

public class StringUtility {
    public static void main(String[] args) {

        String str = "Java";
        //"avaJ"      0123

        String reverse = " ";//"avaj"
        for (int i = str.length() - 1; i >= 0; i--) {//from the beginning of third index we will start loop
            //until i>0 we count backdown

            reverse += str.charAt(i);


            System.out.println(reverse);//avaJ
            System.out.println("__________________________________________________");

            String name = "Svetlana Denisenko";
            String result = reverse1(name);
            System.out.println(result);
        }
    }

    public static String reverse1(String str) {
        String reverse1 = "";//to contain all the characters of the given string in reverse
        for (int i = str.length() - 1; i >= 0; i--) {//i: index number of the given string starting from last index to index 0
            reverse1 += str.charAt(i);//to get each characters of the string starting from last index to index 0
        }
        return reverse1;
    }

    public static String reverse(String p) {
        return null;
    }
}

// a
//__________________________________________________
//oknesineD analtevS
// av
//__________________________________________________
//oknesineD analtevS
// ava
//__________________________________________________
//oknesineD analtevS
// avaJ
//__________________________________________________
//oknesineD analtevS
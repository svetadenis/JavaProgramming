package day14_forLoop;

public class StringReverse {
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
        public static String reverse1(String str){
            String reverse1 = "";
        for (int  i = str.length()-1; i>=0;i--){
            reverse1+=str.charAt(i);
        }
        return reverse1;
        }

}

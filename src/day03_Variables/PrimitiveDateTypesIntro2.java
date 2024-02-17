package day03_Variables;

public class PrimitiveDateTypesIntro2 {
    public static void main(String[] args) {

        //DataType variable  = Data
        // perimeter char used for single character with ''

     char a = '@';
     char b = '!';
        System.out.println(a);
        System.out.println(b);
     //char d = '@!'; wrong, because it's not a single character, it's two of them

     //ascii table has universal system of special characters.
     //Each charachers have number

        char ch1 = 'A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("---------------------------------------------------");

        char ch3 = 40000;
        System.out.println(ch3);
        System.out.println("___________________________________________________");

        //char ch4 = -100; wrong, because <0; char is from 0 to

        int sum = 'A' +'B';
        //         65   66 = 131
        System.out.println(sum);

        //boolean r2 = 2.5; it's not for decemal numbers
        //boolean r1 = 123; it's not for primitive nymbers
        //boolean r3 = "Java" it's not for strings

        boolean r4 = true;
        boolean r5 = false;
        boolean r6 = 100>10;//true
        boolean r7 = 0<-1;//false
        System.out.println(r6);
        System.out.println(r7);














    }
}

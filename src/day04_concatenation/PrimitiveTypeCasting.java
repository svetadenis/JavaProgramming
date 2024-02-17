package day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        //iplicit casting: smaller perimeter type casting into bigger perimeter type

        byte a = 15;
        short b = a;

        System.out.println(b);//15

        int c = a;
        System.out.println(c);//15

        long d = 3000L;
        float f = d;
        System.out.println(f);//3000.0

        //explicit casting: larger perimeter type casting into smaller perimeter type

        int x = 100; //larger
        byte y = (byte) x; //smaller
        System.out.println(y);//100

        float z = 20.8f;
        short q = (short)z;
        System.out.println(q);//20

        double n1 = 2.5;
        byte n2 = (byte) n1;//n1 = 2.5
        System.out.println(n2); //n2 = 2
        System.out.println("________________________________________________________");

        int num = 500;
        byte result = (byte) num;//explicit casting
        System.out.println(result);//-12

        int r = 50000;
        short t = (short) r;
        System.out.println(t);//-15536
        System.out.println("________________________________________________________");

        double u = 3000.5;
        int p = (int)u;
        System.out.println(p);//3000 explicit casting

        int o = 100;
        double d1 = o;
        System.out.println(d1);//100.0



















    }
}

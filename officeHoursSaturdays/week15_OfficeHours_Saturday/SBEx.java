package week15_OfficeHours_Saturday;

public class SBEx {
    public static void main(String[] args) {

        String s = "java";
        s.concat("world");

        System.out.println(s);

        StringBuilder sb = new StringBuilder("java");
        sb.append("world");
        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

    }
}

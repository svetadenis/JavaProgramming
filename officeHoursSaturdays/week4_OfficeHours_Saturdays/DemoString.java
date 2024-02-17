package week4_OfficeHours_Saturdays;

public class DemoString {
    public static void main(String[] args) {

        String s = "Saturday";
        s = "Sat";
        String s2 = "Sat";
        System.out.println(s == "Sat"); // == compares the object (memory address) NOT the value
        System.out.println(s == s2); // is the object s points to the same as the object s2 points to
        System.out.println(s == new String("Sat")); // this compares a Sat from the String pool with a different object
        System.out.println(s.equals(new String("Sat"))); // is is making a new object and you are comparing the value
        System.out.println(s.equals(new String("SAT")));

}}

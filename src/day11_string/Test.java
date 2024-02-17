package day11_string;

public class Test {
    public static void main(String[] args) {
        String name = "chack norris";
        name = name.trim().toUpperCase();
        name=name.charAt(0)+"."+name.charAt(6)+".";
        System.out.println(name);
    }}
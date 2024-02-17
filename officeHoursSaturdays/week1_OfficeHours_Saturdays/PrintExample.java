package week1_OfficeHours_Saturdays;

public class PrintExample {
    public static void main(String[] args) {

        // this is multiple println statements
        System.out.println("On the weekend we will do these things");
        System.out.println("Relax");
        System.out.println("Practice java");
        System.out.println("Cook some good food");

        System.out.println(); // this will create an empty line on the console

        // this is using print methods --> print methods DO NOT break the line
        System.out.print("For java I am learning these topics ");
        System.out.print("1) printing ");
        System.out.print("2) main method ");
        System.out.print("3) variables ");

        System.out.println(); // above we use print methods, so we never broke the line

        // repeat the first task, but only one println
        System.out.println("On the weekend \\ we will do these things\n\tRelax\n\tPractice java\n\t\"Cook\" some good food");

        /*
            \\ -> the first backslash was the syntax for representing the escape sequence
                then the second backslash is a character, that is printed

                \n -> this broke the line, goes to the next line

                \t -> tab(indents)
         */

    }
}


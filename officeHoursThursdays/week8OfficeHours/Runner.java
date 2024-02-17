package week8OfficeHours;

public class Runner {
    public static void main(String[] args) {
        System.out.println(T1CharacterSet.getCharacterSequence('7', 'P'));
        System.out.println(T1CharacterSet.getCharacterSequence('X', '}'));

        System.out.println(T1CharacterSet.getCharacterSequence("lowercase"));


        // using multiple variables in a loop
        byte a, b, c;
        short z = 1, y = 2;

        for(int i = 0, x = 1; i < 5 && x < 3; i++, x++){
        }

        System.out.println(T3Syllables.countSyllables("ham-bur-ger"));
        System.out.println(T3Syllables.countSyllables2("ham-bur-ger"));

        System.out.println(T4SortedOrder.strIsSorted("abcd"));
        System.out.println(T4SortedOrder.strIsSorted("ayeu"));
        System.out.println(T4SortedOrder.strIsSorted("zkbn"));

        System.out.println(T5CamelCase.makeCamelCase("JAVA will ruLE tHe wORLd"));
}}

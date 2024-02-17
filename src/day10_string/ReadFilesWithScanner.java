package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_string/Test.txt"));
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());// print on console line 2 from file text
        System.out.println(scan.nextLine ());//print line 3 from file.text on the  console
        //if text file is empty, it will be the error on console
        /* System.out.println(scan.next());
 System.out.println(scan.next()); print only one word from the file */

     //   System.out.println(scan.hasNext());//read the entire line from the file
        scan.close();

    }
}

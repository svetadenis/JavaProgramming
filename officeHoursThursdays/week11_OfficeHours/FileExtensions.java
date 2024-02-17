package week11_OfficeHours;
import java.util.ArrayList;
import java.util.Arrays;

public class FileExtensions {
    public static void main(String[] args) {

        ArrayList<String> files = new ArrayList<>(Arrays.asList("First.java", "HelloWorld.java", "Notes1.txt", "Notes2.mp3", "Review1.mp3", "Practice.java", "dog.png", "cat.png", "Pet.mp3", "Automation.java", "Song.mp3"));
        System.out.println(files);

        //  find all the file names that have the extension: .java
        ArrayList<String> forJavaFiles = new ArrayList<>(files); // copies the original data
        //find all the file names that have the extension: .java
        forJavaFiles.removeIf(p -> !p.endsWith(".java"));
        System.out.println(forJavaFiles);

        // remove all the file names that have the extension: .png, .mp3
        ArrayList<String> filesNoPngMp3 = new ArrayList<>(files);
        filesNoPngMp3.removeIf(name -> name.endsWith(".png") || name.endsWith(".mp3"));
        System.out.println(filesNoPngMp3);

    }
}
/*
File Extensions [ArrayList, String]

    create a program that has an ArrayList with different file names

    find all the file names that have the extension: .java
    remove all the file names that have the extension: .png, .mp3

    sample file names: "First.java", "HelloWorld.java", "Notes1.txt", "Notes2.mp3", "Review1.mp3", "Practice.java", "dog.png", "cat.png", "Pet.mp3", "Automation.java", "Song.mp3"
 */

/*  wrong way to approach this
 ArrayList<String> forJavaFiles = files;

        forJavaFiles.clear();

        System.out.println(files);
        System.out.println(forJavaFiles);
 */
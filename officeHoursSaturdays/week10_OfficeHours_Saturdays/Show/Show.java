package week10_OfficeHours_Saturdays.Show;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Show {
    public String name;
    public int numberOfSeasons;
    public LocalDate releaseDate;
    public boolean isCompleted;
    public ArrayList<String> audioLanguages;

    public Show(String name, int numberOfSeasons, LocalDate releaseDate, boolean isCompleted, ArrayList<String> audioLanguages) {
        this.name = name;
        this.numberOfSeasons = numberOfSeasons;
        this.releaseDate = releaseDate;
        this.isCompleted = isCompleted;
        this.audioLanguages = new ArrayList<>(audioLanguages); // this makes sure we make a new ArrayList and copy the elements. it makes sure we don't just have the references pointing to the same object
    }

    public String toString(){
        return name + "\nNumber of season: " + numberOfSeasons + "\nRelease Date: " + releaseDate.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")) + "\n" + (isCompleted ? "Completed" : "Ongoing") + "\nAvailable Languages: " + audioLanguages + "\n";
    }

}
/*
    Create a class Show
        define these instance variables
            name
            number of seasons
            release date
            boolean completed
                true - finished
                false - ongoing
            audio languages available (String ArrayList)

    create a constructor that will initialize all the variables

    create a toString to display all the information about the Show
 */
package week13_OfficeHours_Saturdays.movie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class Movie {

    private String title;
    private int rating;
    private int minutes;
    private final LocalDate releaseDate;

    public Movie(String title, int rating, int minutes, LocalDate releaseDate) {
        this.title = title;
        this.rating = rating;
        this.minutes = minutes;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString(){
        return title + "\nRating: " + rating + "/5\n" + minutes + " minutes runtime\n" + releaseDate.format(DateTimeFormatter.ofPattern("MMM d y")) +"\n";
    }

}
/*
    - Create a final class Movie
        create the following instance variables:
            title, rating(out of 5), duration(minutes), year

        create a constructor to initialize all the variables

        encapsulate the class

        create a toString to print the information of the Movie
 */
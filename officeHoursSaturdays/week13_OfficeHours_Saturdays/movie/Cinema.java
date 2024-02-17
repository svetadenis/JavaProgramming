package week13_OfficeHours_Saturdays.movie;

import java.util.ArrayList;

public final class Cinema implements PlayMovie{

    private String location;
    private int numberOfTheaters;
    private ArrayList<Movie> availableMovies;

    public Cinema(String location, int numberOfTheaters, ArrayList<Movie> availableMovies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.availableMovies = new ArrayList<>(availableMovies); // we need to create a new ArrayList object for each Cinema object. then we copy the given movies from the parameter
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle() + " Starting, please grab your popcorn and turn your phones off for " + movie.getMinutes() + " minutes");
    }

    public int buyTicket(Movie movie){
        switch (movie.getRating()){
            case 5:
                return  25;
            case 4:
            case 3:
                return 20;
            default:
                return 15;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfTheaters() {
        return numberOfTheaters;
    }

    public void setNumberOfTheaters(int numberOfTheaters) {
        this.numberOfTheaters = numberOfTheaters;
    }

    public ArrayList<Movie> getAvailableMovies() {
        return availableMovies;
    }

    // we deleted the setters, because we don't want to set the whole ArrayList to something else

    @Override
    public String toString() {
        return location + "\nNumber of theaters: " + numberOfTheaters + "\n" + availableMovies;
    }
}

/*
- Create a final class Cinema
        create the following instance variables:
            location, number of theaters, List of Movies

        create a constructor to initialize all the variables

        implement the PlayMovie & implement the playMovie method to say: "Moving Starting, please grab your popcorn and turn your phones off"

        create a method buyTicket(Movie):
            print how much a movie ticket is. The cost is based on the rating of the movie. If it is a 5 the movie costs 25, if it is 3 or 4 it cost 20 and any other rating is 15

        create a toString that will display the information about the Cinema and which Movies are available to watch
 */
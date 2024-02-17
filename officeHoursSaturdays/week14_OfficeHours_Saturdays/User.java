package week14_OfficeHours_Saturdays;

import week13_OfficeHours_Saturdays.movie.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    public static void main(String[] args) {

        ArrayList<StreamingSite> streamingSites = new ArrayList<>(Arrays.asList(
                new Hulu("hulu.com", 10, 100),
                new Amazon("amazon.com", 5, 200),
                new Netflix("netflix.com", 15, 400)
        ));

        for(StreamingSite each : streamingSites){
            each.subscribe();
            each.pause();
        }

        playOnAll(streamingSites.get(0));

        Movie avatar = new Movie("Avatar", 5, 180, LocalDate.of(2009, 12, 18));
        Movie avatar2 = new Movie("Avatar: Way of the Water", 5, 180, LocalDate.of(2023, 12, 16));
        Movie ironman = new Movie("IronMan", 5, 120, LocalDate.of(2008, 5, 2));
        Movie inception = new Movie("Inception", 4, 150, LocalDate.of(2010, 7, 16));
        Movie darkKnight = new Movie("The Dark Knight", 5, 152, LocalDate.of(2008, 7, 18));
        Movie interstellar = new Movie("Interstellar", 4, 169, LocalDate.of(2014, 11, 5));

        ArrayList<Movie> baseMovies = new ArrayList<>(Arrays.asList(avatar, avatar2, ironman, inception, darkKnight, interstellar));

        Cinema cinema = new Cinema("128723 Bone Drive", 10, baseMovies);

        playOnAll(cinema);

    }

    public static void playOnAll(PlayMovie playMovie){
        playMovie.playMovie(new Movie("Star Wars", 10, 160, LocalDate.of(1990, 12, 10)));
    }
}
/*
    - Create a final class User
        create a main method and create Movie, Cinema, Netflix, Amazon, & Hulu objects
        create a List of all the StreamingSites used. Then subscribe to them all.
            extra: you can also pause the movie
        create a List of PlayMovie and add multiple different Cinema and StreamingSite objects. Then play your favorite movie on all of the options
 */
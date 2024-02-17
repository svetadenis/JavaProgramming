package week13_OfficeHours_Saturdays.movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        Movie avatar = new Movie("Avatar", 5, 180, LocalDate.of(2009, 12, 18));
        Movie avatar2 = new Movie("Avatar: Way of the Water", 5, 180, LocalDate.of(2023, 12, 16));
        Movie ironman = new Movie("IronMan", 5, 120, LocalDate.of(2008, 5, 2));
        Movie inception = new Movie("Inception", 4, 150, LocalDate.of(2010, 7, 16));
        Movie darkKnight = new Movie("The Dark Knight", 5, 152, LocalDate.of(2008, 7, 18));
        Movie interstellar = new Movie("Interstellar", 4, 169, LocalDate.of(2014, 11, 5));

        ArrayList<Movie> baseMovies = new ArrayList<>(Arrays.asList(avatar, avatar2, ironman, inception, darkKnight, interstellar));

        Cinema cinema = new Cinema("128723 Bone Drive", 10, baseMovies);
        System.out.println(cinema);
        cinema.playMovie(ironman);
        System.out.println(cinema.buyTicket(ironman));

        // Print the names of all the movies
        for(Movie each : cinema.getAvailableMovies()){
            System.out.println(each.getTitle());
            System.out.println(each.getReleaseDate());
        }

        System.out.println("====================");

        ArrayList<Movie> shortMovies = new ArrayList<>(Arrays.asList(
                new Movie("Facebook", 3, 110, LocalDate.of(2014, 2, 19)),
                new Movie("Father", 3, 120, LocalDate.of(2015, 4, 1))
        ));

        Cinema cinema2 = new Cinema("2313 Lory Lane", 3, shortMovies);
        System.out.println(cinema2);

        System.out.println("-------------");

        Cinema cinema3 = new Cinema("34243 Random Lane", 4, shortMovies);
        System.out.println(cinema3);

        System.out.println("------------- AFTER -------------");

        cinema3.getAvailableMovies().add(new Movie("Get Out", 4, 120, LocalDate.of(2017, 3, 5)));

        System.out.println("------------- FOR CINEMA 2 -------------");
        System.out.println(cinema2);
        System.out.println("------------- FOR CINEMA 3 -------------");
        System.out.println(cinema3);

        System.out.println("====================");

        Netflix netflixUS = new Netflix("www.netflix.us", 15.99, 300);
        netflixUS.subscribe();
        netflixUS.playMovie(interstellar);

        Netflix netflixCA = new Netflix("www.netflix.ca", 18.99, 250);
        netflixCA.subscribe();

    }
}
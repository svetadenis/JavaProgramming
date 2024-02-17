package week13_OfficeHours_Saturdays.movie;

public class Hulu extends StreamingSite{
    public Hulu(String url, double subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribe to Hulu for " + getSubscriptionAmount());
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle() + " started playing on " + getUrl());
    }

    @Override
    public void pause() {
        System.out.println("Continue?");
    }
}
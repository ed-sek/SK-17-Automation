package lectures.lecture9.exercises;

import java.util.ArrayList;

public class Movie {

    String title = "";
    String genre = "";
    double rating = 0.0;

    public Movie(String movieTitle, String movieGenre, double movieRating) {

        this.title = movieTitle;
        this.genre = movieGenre;
        this.rating = movieRating;
    }

    // create an empty no-args constructor for general-use
    public Movie(){}

    public void displayMovie(){
        System.out.println("The movie details are: ");
        System.out.println("The title is: " + this.title);
        System.out.println("The genre is: " + this.genre);
        System.out.println("The rating is: " + this.rating);
    }
}



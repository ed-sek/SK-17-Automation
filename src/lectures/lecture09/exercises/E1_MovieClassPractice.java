package lectures.lecture09.exercises;

public class E1_MovieClassPractice {

    // declare a constant
    private static final String LINE_SEPARATOR = "============";

    public static void main(String[] args) {

        Movie matrix = new Movie("Matrix", "Sci-Fi", 8.7);
        Movie gladiator = new Movie("Gladiator", "Epic", 8.5);
        Movie batmanBegins = new Movie("Batman Begins", "Superhero", 8.2);
        Movie bigLebowski = new Movie("The Big Lebowski", "Comedy", 8.1);
        Movie shutterIsland = new Movie("Shutter Island", "Thriller", 8.4);
        Movie godfather = new Movie("The Godfather", "Crime", 9.2);


        matrix.displayMovie();
        System.out.println(LINE_SEPARATOR);
        gladiator.displayMovie();
        System.out.println(LINE_SEPARATOR);
        batmanBegins.displayMovie();
        System.out.println(LINE_SEPARATOR);
        bigLebowski.displayMovie();
        System.out.println(LINE_SEPARATOR);
        shutterIsland.displayMovie();
        System.out.println(LINE_SEPARATOR);
        godfather.displayMovie();
        System.out.println(LINE_SEPARATOR);

    }
}

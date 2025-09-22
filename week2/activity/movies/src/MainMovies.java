public class MainMovies {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        // Print movie1 properties
        System.out.println(movie1);

        Movie movie2 = new Movie("The Godfather", 175);
        // Print movie2 properties
        System.out.println(movie2);

        // Print movie2 running time
        System.out.println(movie2.getRunningTime());

        // Play movie2
        movie2.play();
        System.out.println(movie2);
        // Stop movie2
        movie2.stop();
        System.out.println(movie2);
        // Resume movie2
        movie2.resume();
        System.out.println(movie2);
    }
}
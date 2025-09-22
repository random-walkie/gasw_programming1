import java.util.ArrayList;

/**
 * class PlayList
 *
 * @author Jim
 * @version (221.0
 */
public class PlayList
{
    // instance variables - replace the example below with your own
    ArrayList<Movie> movies;

    /**
     * Constructor for objects of class PlayList
     */
    public PlayList()
    {
        this.movies = new ArrayList<Movie>();
    }

    public void addToPlayList(Movie movie)
    {
        movies.add(movie);
    }

    public void showList()
    {
        for (Movie m : movies)
            System.out.println(m.getTitle());
    }
}

package com.movie.DAO;

/*import java.util.ArrayList;
import com.movie.data.Movie;*/

public interface MovieDao {
    public void addMovie();

    // ArrayList <Movie> viewAllMovies();
    void viewAllMovies();

    void viewMovie(int mId);
}

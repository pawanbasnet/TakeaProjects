package com.movie.details;

import java.util.Scanner;

import com.movie.DAO.MovieDao;
import com.movie.DAO.impl.MovieImpl;
import com.movie.client.MovieCilent;

public class MovieDetails {
    Scanner scan = new Scanner(System.in);
    MovieDao movieImpl = new MovieImpl();

    public void movieDetails(int i) {
        if (i == 1) {
            while (true) {
                System.out.println("------------");
                System.out.println("1. Add Movie");
                System.out.println("2. View all Movie");
                System.out.println("3. View Movie");
                //need to add update method
                System.out.println("4. Back");

                System.out.println("Please select from the option above");
                System.out.println("-----------------------------------");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        movieImpl.addMovie();
                        break;
                    case 2:
                        movieImpl.viewAllMovies();
                        break;
                    case 3:
                        System.out.println("Enter the Movie name to search");
                        String movieName = scan.next();
                        movieImpl.viewMovie(movieName);
                        break;
                    case 4:
                        MovieCilent.main(null);
                        break;
                    default:
                        System.out.println("Please select one of the option above");
                }
            }
        }else {
            while (true) {
                System.out.println("------------");
                System.out.println("1. View all Movie");
                System.out.println("2. View Movie");
                //need to add ticket checkout
                System.out.println("3. Back");

                System.out.println("Please select from the option above");
                System.out.println("-----------------------------------");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        movieImpl.viewAllMovies();
                        break;
                    case 2:
                        System.out.println("Enter the Movie name to search");
                        String movieName = scan.next();
                        movieImpl.viewMovie(movieName);
                        break;
                    case 3:
                        MovieCilent.main(null);
                        break;
                    default:
                        System.out.println("Please select one of the option above");
                }
            }
        }
    }
}
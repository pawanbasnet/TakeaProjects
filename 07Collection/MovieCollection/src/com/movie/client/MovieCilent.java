package com.movie.client;

import java.util.Scanner;

import com.movie.details.MovieDetails;

public class MovieCilent {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("------------");
                System.out.println("1. Movie Management");
                System.out.println("2. Registration");
                System.out.println("3. Exit");

                System.out.println("Please select from the option above");
                System.out.println("-----------------------------------");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        MovieDetails mv = new MovieDetails();
                        mv.movieDetails();
                    case 2:
                        System.out.println("Place holder");
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please select one of the option above");
                }
            }
        }
    }
}

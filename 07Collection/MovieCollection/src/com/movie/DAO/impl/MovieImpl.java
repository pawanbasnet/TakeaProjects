package com.movie.DAO.impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.movie.DAO.MovieDao;
import com.movie.data.Movie;

public class MovieImpl implements MovieDao {

    Scanner scan = new Scanner(System.in);
    static ArrayList<Movie> mList = new ArrayList<>();

    @Override
    public void addMovie() {
        System.out.println("Enter the Movie name");
        String mName = "";
        mName+=scan.next();
        System.out.println("Enter the Movie ID");
        int mId = scan.nextInt();
        System.out.println("Enter the Movie Price");
        int ticketPrice = scan.nextInt();
        System.out.println("Enter the ticket available");
        int ticketQuan = scan.nextInt();
        Movie m = new Movie(mName, mId, ticketPrice, ticketQuan);
        mList.add(m);
        System.out.println("Do you wish to add more movie");
        System.out.println("1. Continue or 2. Back");
        System.out.println("Please select from the option above");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                addMovie();
                break;
            case 2:
                System.out.println("Returning back");
                break;
            default:
                System.out.println("Please select one of the option above");
        }
    }

    @Override
    public void viewAllMovies() {
        if (mList.size() != 0) {
            System.out.println("Movie \t MovieId \t Price \t Quantity");
            System.out.println("-------------------------------------------------");
            for (Movie movie : mList) {
                System.out.println(
                        movie.getMovieName() + "\t " + movie.getMoiveId() + "\t " + movie.getTicketPrice() + "\t "
                                + movie.getTicketQuantity());
            }
        } else
            System.out.println("No movie added yet");
    }
    @Override
    public void viewMovie(String movieName) {
        int check = 0;
        if (mList.size() != 0) {
            for (Movie movie : mList) {
                if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                    System.out.println("Movie \t MovieId \t Price \t Quantity");
                    System.out.println("-------------------------------------------------");
                    System.out.println(
                            movie.getMovieName() + "\t " + movie.getMoiveId() + "\t " + movie.getTicketPrice() + "\t "
                                    + movie.getTicketQuantity());
                    ++check;
                }
            }
        } else {
            System.out.println("No movie added yet");
            ++check;
        }
        if (check == 0)
            System.out.println("Movie Not found");
    }
}

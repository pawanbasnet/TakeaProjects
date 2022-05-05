package com.movie.client;

import java.util.Scanner;

import com.access.details.UserDetails;
import com.movie.details.MovieDetails;
import com.access.DAO.Impl.*;
import com.access.data.User;

public class MovieCilent {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("------------");
                System.out.println("1. Log in");
                System.out.println("2. Registration");
                System.out.println("3. Exit");

                System.out.println("Please select from the option above");
                System.out.println("-----------------------------------");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        // MovieDetails mv = new MovieDetails();
                        // mv.movieDetails();
                        System.out.println("Enter User Name");
                        String uname = scan.next();
                        if (uname.equals("admin")) {
                            System.out.println("Enter PassWord");
                            String pass = scan.next();
                            if (pass.equals("admin@123")) {
                                MovieDetails mv = new MovieDetails();
                                mv.movieDetails(1);
                            } else {
                                System.out.println("Incorrect Password");
                            }

                        } else {
                           // System.out.println("u list size is "+UserImpl.uList.size());
                            int size = UserImpl.uList.size();
                            int check = 0;
                            if (size != 0) {
                                for (User user : UserImpl.uList) {
                                    if (user.getUname().equalsIgnoreCase(uname)) {
                                        System.out.println("Enter PassWord");
                                        String pass = scan.next();
                                        if (user.getPassword().equals(pass)) {
                                            MovieDetails mv = new MovieDetails();
                                            mv.movieDetails(2);
                                            ++check;
                                        }
                                    }
                                }
                            } else {
                                System.out.println("No user added yet");
                                ++check;
                            }
                            if (check == 0)
                                System.out.println("User Not found");
                        }
                        break;
                    case 2:
                        UserDetails u = new UserDetails();
                        u.userDetails();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please select one of the option above");
                }
            }
        }
    }
}

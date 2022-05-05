package com.access.details;

import java.util.Scanner;

import com.movie.client.*;
import com.access.DAO.UserDao;
import com.access.DAO.Impl.UserImpl;

public class UserDetails {
    Scanner scan = new Scanner(System.in);
    UserDao userImpl = new UserImpl();

    public void userDetails() {
        while (true) {
            System.out.println("------------");
            System.out.println("1. Add User");
            System.out.println("2. View all User");
            System.out.println("3. View User");
            System.out.println("4. Back");

            System.out.println("Please select from the option above");
            System.out.println("-----------------------------------");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    userImpl.addUser();
                    break;
                case 2:
                    userImpl.viewAllUser();
                    break;
                case 3:
                    System.out.println("Enter the User name to search");
                    String userName = scan.next();
                    userImpl.viewUser(userName);
                    break;
                case 4:
                    System.out.println("Return to main");
                    MovieCilent.main(null);
                    break;
                default:
                    System.out.println("Please select one of the option above");
            }
        }
    }
}
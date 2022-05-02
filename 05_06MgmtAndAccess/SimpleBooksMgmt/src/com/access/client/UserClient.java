package com.access.client;

import java.util.*;

import com.access.userImpl.UserImpl;

public class UserClient {
    public static void main(String[] args) {
        System.out.println("Welcome to Book Managment System");
        System.out.println("Please register first to access management");
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("-----------");
                System.out.println("1. Register");
                System.out.println("2. Log in");
                System.out.println("3. Exit");
                System.out.println("Please select from the option above");
                System.out.println("-----------------------------------");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        UserImpl add = new UserImpl();
                        add.addUser();
                        break;
                    case 2:
                        UserImpl login = new UserImpl();
                        login.logIn();
                        break;
                    case 3:
                        System.out.println("Thanks for using the Book Management System");
                        System.exit(0);
                    default:
                        System.out.println("Please select one of the option above");
                }
            }
        }
    }
}

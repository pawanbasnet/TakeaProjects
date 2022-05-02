package com.access.userImpl;

import java.util.*;

import com.access.data.UserData;
import com.books.client.BookClient;

public class UserImpl {

    Scanner scan = new Scanner(System.in);
    static UserData[] users = null;

    public void addUser() {
        System.out.println("How many users are you adding?");
        int size = scan.nextInt();
        users = new UserData[size];
        for (int index = 0; index < size; index++) {
            System.out.println("Enter First name: ");
            String firstName = scan.next();
            System.out.println("Enter Last name: ");
            String lastName = scan.next();
            System.out.println("Enter email");
            String email = scan.next();
            System.out.println("Enter User name");
            String userName = scan.next();
            System.out.println("Enter Password");
            String pass = scan.next();

            UserData user = new UserData(firstName, lastName, email, userName, pass);
            users[index] = user;
            System.out.println("User registered successfully!!!");
            System.out.println("-------------------------------");
        }
    }

    public void logIn() {
        int check = 0;
        if (users != null) {
            System.out.println("Enter User name to log in");
            String uName = scan.next();
            for (UserData u : users) {
                if (u.getUname().equalsIgnoreCase(uName)) {
                    System.out.println("Enter Password: ");
                    String ps = scan.next();
                    if (u.getPassword().equals(ps)) {
                        System.out.println("Password Comfimn");
                        BookClient bc = new BookClient();
                        bc.bookClient();
                    } else {
                        System.out.println("Incorrect password!!!");
                    }
                    check++;
                }
            }
        } else {
            System.out.println("There are no users. Please register users first");
            check++;
        }
        if (check == 0) {
            System.out.println("No such user found!!!");
        }
    }
}

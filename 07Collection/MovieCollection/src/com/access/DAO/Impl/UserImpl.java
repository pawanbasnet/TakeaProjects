package com.access.DAO.Impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.access.DAO.UserDao;
import com.access.data.User;

public class UserImpl implements UserDao {

    Scanner scan = new Scanner(System.in);
    public static ArrayList<User> uList = new ArrayList<>();

    @Override
    public void addUser() {
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
        User u = new User(firstName, lastName, email, userName, pass);
        uList.add(u);
        System.out.println("User added successfully");
        }

    }

    @Override
    public void viewAllUser() {
        if (uList.size() != 0) {
            System.out.println("Fname \t Lname \t Email \t User \t Password");
            System.out.println("-------------------------------------------------");
            for (User user : uList) {
                System.out.println(
                        user.getFname() + "\t " + user.getLname() + "\t " + user.getEmail() + "\t "
                                + user.getUname() + "\t " + user.getPassword());
            }
        } else
            System.out.println("No user added yet");
    }

    @Override
    public void viewUser(String Uname) {
        int check = 0;
        if (uList.size() != 0) {
            for (User user : uList) {
                if (user.getUname() == Uname) {
                    System.out.println("Fname \t Lname \t Email \t User \t Password");
                    System.out.println("---------------------------------------------------");
                    System.out.println(
                            user.getFname() + "\t " + user.getLname() + "\t " + user.getEmail() + "\t "
                                    + user.getUname() + "\t " + user.getPassword());
                    ++check;
                }
            }
        } else {
            System.out.println("No user added yet");
            ++check;
        }
        if (check == 0)
            System.out.println("User Not found");
    }

}

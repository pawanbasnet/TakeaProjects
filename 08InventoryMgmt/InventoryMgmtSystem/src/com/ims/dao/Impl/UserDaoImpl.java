package com.ims.dao.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.UserDao;
import com.ims.model.User;

public class UserDaoImpl implements UserDao {

    Scanner sc = new Scanner(System.in);
    static List<User> addUsers = new ArrayList<>();

    // BufferedReader bf=new BufferedReader(bf);

    @Override
    public void register() {
        System.out.println("Enter First name");
        String fname = sc.next();
        // String fname = bf.readLine();
        System.out.println("Enter Last name");
        String lname = sc.next();
        System.out.println("Enter cell number");
        long cell = sc.nextInt();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter password");
        String pass = sc.next();

        User user = new User(fname, lname, cell, email, pass);
        addUsers.add(user);
        System.out.println("User Registered Successfully");
    }

    @Override
    public boolean verify(String email, String pass) {
        for (User user : addUsers) {
            if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }
}

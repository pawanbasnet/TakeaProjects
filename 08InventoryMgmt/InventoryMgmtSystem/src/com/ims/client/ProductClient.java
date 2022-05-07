package com.ims.client;

import java.util.Scanner;

import com.ims.dao.UserDao;
import com.ims.dao.Impl.UserDaoImpl;
import com.ims.details.ProductDetails;

public class ProductClient {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            UserDao daoImpl = new UserDaoImpl();

            while (true) {
                System.out.println("---------------------------");
                System.out.println("1)Admin");
                System.out.println("2)Product");
                System.out.println("3)Rgister");
                System.out.println("4)Exit");
                System.out.println("---------------------------");
                System.out.println("Enter your Choice");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter User Name");
                        String uname = sc.next();
                        System.out.println("Enter Password");
                        String pass = sc.next();
                        if (uname.equalsIgnoreCase("Admin") && pass.equals("Admin@123")) {
                            ProductDetails details = new ProductDetails();
                            details.productMenu();
                        } else
                            System.out.println("Invalid user");
                        break;
                    case 2:
                        System.out.println("Enter Email");
                        String email = sc.next();
                        System.out.println("Enter password");
                        String password = sc.next();

                        boolean flag = daoImpl.verify(email, password);
                        if (flag) {
                            ProductDetails details = new ProductDetails();
                            details.ViewproductMenu();
                        } else {
                            System.out.println("Invalid User");
                        }
                        break;
                    case 3:
                        daoImpl.register();
                        break;
                    case 4:
                        System.out.println("Thank you for using the application");
                        break;
                    default:
                        System.out.println("Choose between 1 to 4");
                }
            }
        }
    }
}

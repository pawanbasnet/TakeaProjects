package com.ims.client;

import java.util.Scanner;

import com.ims.details.ProductDetails;

public class ProductClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------");
            System.out.println("1)Product");
            System.out.println("2)Exit");
            System.out.println("---------------------------");
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter User Name");
                    String uname = sc.next();
                    System.out.println("Enter Password");
                    String pass = sc.next();
                    if(uname.equalsIgnoreCase("Admin")&&pass.equals(Admin@123)){
                        ProductDetails details = new ProductDetails();
                        details.productMenu();
                    }
                    else 
                    System.out.println("Invalid user");
                    break;
                    case 2:
                    System.exit(0);
                default:
                System.out.println("Thank you for using the application");
                    break;
            }
        }
    }
}

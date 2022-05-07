package com.ims.details;

import java.util.List;
import java.util.Scanner;

import com.ims.client.ProductClient;
import com.ims.dao.ProductDao;
import com.ims.dao.Impl.ProductDaoImpl;
import com.ims.model.Product;

public class ProductDetails {

    Scanner sc = new Scanner(System.in);
    ProductDao daoImpl = new ProductDaoImpl();

    public void productMenu() {
        while (true) {
            System.out.println("------------------------------");
            System.out.println("1)Add Product");
            System.out.println("2)View all Product");
            System.out.println("3)View Product");
            System.out.println("4)Back");
            System.out.println("------------------------------");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    daoImpl.addProducts();
                    break;
                case 2:
                    List<Product> viewAllProduct = daoImpl.viewAllProduct();

                    
                    for (Product pro : viewAllProduct) {
                        System.out.println(
                                pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getPrice() + "\t" + pro.getQty());
                    }
                    break;
                case 3:
                    System.out.println("Enter Product Number");
                    Product pro = daoImpl.viewProduct(sc.nextInt());
                    if (pro != null) {
                        System.out.println(
                                pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getPrice() + "\t" + pro.getQty());
                    } else
                        System.out.println("Product does not exist");
                    break;
                case 4:
                    ProductClient.main(null);
                    break;
                default:
                System.out.println("Choose between 1 to 4");
                    break;
            }
        }

    }
    public void ViewproductMenu() {
        while (true) {
            System.out.println("------------------------------");
            System.out.println("1)View all Product");
            System.out.println("2)View Product");
            System.out.println("3)Back");
            System.out.println("------------------------------");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    List<Product> viewAllProduct = daoImpl.viewAllProduct();

                    
                    for (Product pro : viewAllProduct) {
                        System.out.println(
                                pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getPrice() + "\t" + pro.getQty());
                    }
                    break;
                case 2:
                    System.out.println("Enter Product Number");
                    Product pro = daoImpl.viewProduct(sc.nextInt());
                    if (pro != null) {
                        System.out.println(
                                pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getPrice() + "\t" + pro.getQty());
                    } else
                        System.out.println("Product does not exist");
                    break;
                case 3:
                    ProductClient.main(null);
                    break;
                default:
                System.out.println("Choose between 1 to 4");
                    break;
            }
        }

    }
}

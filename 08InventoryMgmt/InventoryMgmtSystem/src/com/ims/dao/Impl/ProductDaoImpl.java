package com.ims.dao.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.ProductDao;
import com.ims.model.Product;

public class ProductDaoImpl implements ProductDao {

    Scanner sc = new Scanner(System.in);

    static List<Product> addProducts = new ArrayList<>();

    @Override
    public void addProducts() {
        int k = 1;
        while (k == 1) {
            System.out.println("Enter Product Number");
            int pid = sc.nextInt();
            System.out.println("Enter Product Name");
            String pname = sc.next();
            System.out.println("Enter the quantity");
            int qty = sc.nextInt();
            System.out.println("Enter the price");
            int price = sc.nextInt();
            Product product = new Product(pid, pname, qty, price);
            addProducts.add(product);
            System.out.println("Product Registered Successfully");
            System.out.println("Do you want to add one more record 1) Yes 2)No");

            k = sc.nextInt();
        }
    }

    @Override
    public List<Product> viewAllProduct() {
        return addProducts;
    }

    @Override
    public Product viewProduct(int pno) {
        for (Product pro : addProducts) {
            if (pro.getPid() == pno) {
                return pro;
            }
        }
        return null;
    }
}

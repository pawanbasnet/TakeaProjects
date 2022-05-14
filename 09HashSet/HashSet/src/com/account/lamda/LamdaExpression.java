package com.account.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    int pid;
    String pname;
    int price;

    public Product(int pid, String pname, int price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

}

public class LamdaExpression {
    public static void main(String[] args) {
        List<Product>addProducts = new ArrayList<Product>();
        addProducts.add(new Product(1, "HP", 845));
        addProducts.add(new Product(2, "Dell", 546)); 
        addProducts.add(new Product(3, "Apple", 7875)); 
        addProducts.add(new Product(4, "Lenovo", 985)); 

        Collections.sort(addProducts,(p1, p2)->
        {
            return p1.pname.compareTo(p2.pname);
        });

      /*   for(Product p:addProducts){
            System.out.println(p.pid+" "+" "+p.pname+" "+p.price);
        } */
        System.out.println("****************************************");
        addProducts.forEach(
            (t) -> System.out.println(t.pid+" "+" "+t.pname+" "+t.price)
        );
        System.out.println("****************************************");
        Stream<Product> streamData = addProducts.stream();
        streamData.forEach(
            (p)->System.out.println(p.pid+" "+" "+p.pname+" "+p.price)
        );
        System.out.println("****************************************");
        Stream<Product> streamData1 = addProducts.stream().filter(n->n.price<900);
        streamData1.forEach(
            (p)->System.out.println(p.pid+" "+" "+p.pname+" "+p.price)
        );

        System.out.println("****************************************");
        System.out.println("Testing filter");
        List<Integer> productList = addProducts.stream().filter(n->n.price<900).map(p->p.price).collect(Collectors.toList());

        productList.forEach(
            (p)->System.out.println(p)
        );

     }
}

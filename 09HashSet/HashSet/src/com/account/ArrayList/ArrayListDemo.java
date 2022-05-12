package com.account.ArrayList;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayListDemo {
    public void MyCom(){

    }
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(50);
        al.add(25);
        al.add(78);

    System.out.println(al);
    Collections.sort(al);
    
    System.out.println(al);

    //Collections.sort(al, new MyCom());

    }
}

package com.account.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<Integer>();
        tr.add(100);
        tr.add(352);
        tr.add(123);
        tr.add(231);
        tr.add(50);
        System.out.println(tr);
        System.out.println(tr.tailSet(100));
        System.out.println(tr.headSet(100));

        System.out.println(tr.subSet(50, 200));
    }
}

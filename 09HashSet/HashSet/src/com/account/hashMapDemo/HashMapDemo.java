package com.account.hashMapDemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        hm.put(100, "Name");
        hm.put(101, "Na");
        hm.put(106, "me");
        hm.put(110, "ame");

        // Just to be name
        System.out.println(hm);

        String name = hm.get(100);
        System.out.println(name + " ");

        // to fetch a keys
        Set<Integer> keySet = hm.keySet();
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            Integer no = it.next();
            System.out.println(no + " ");
        }

        // to get the value
        Collection<String> val = hm.values();
        for (String str : val) {
            System.out.println(str);
        }


        Stack <Integer> stk = new Stack<>();
        stk.push(78);
        stk.push(45);
        stk.push(23);

        stk.search(78);

    }
}

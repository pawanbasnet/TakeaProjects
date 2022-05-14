package com.account.lamda;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer>addValues = new ArrayList<>();
        addValues.add(12);
        addValues.add(31);
        addValues.add(54);
        addValues.add(10);

        addValues.forEach(
            (k)->System.out.println(k)
        );
    }
}

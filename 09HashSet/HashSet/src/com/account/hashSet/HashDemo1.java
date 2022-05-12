package com.account.hashSet;
import java.util.HashSet;
import java.util.Scanner;

public class HashDemo1 {
    public static void main(String[] args) {
        Account acc = new Account(100, "Saving");
        Account acc1 = new Account(101, "Current");
        Account acc2 = new Account(102, "Current");
        HashSet<Account> hs = new HashSet<>();
        hs.add(acc);
        hs.add(acc1);
        hs.add(acc2);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Account Number:");
            int accNo = sc.nextInt();
            int k = 0;

            for (Account account : hs) {
                if (account.getAid() == accNo) {
                    System.out.println(account.getAid() + "\t" + account.getAname());
                    ++k;
                }
            }
            if (k == 0) {
                System.out.println("Record not found");
            }
        }

    }

}

package com.books.client;

import java.util.*;

import com.access.client.UserClient;
import com.books.details.*;

public class BookClient {

	public void bookClient() {

		try (Scanner scan = new Scanner(System.in)) {
			while (true) {
				System.out.println("--------");
				System.out.println("1. Books");
				System.out.println("2. Back");
				System.out.println("Please select from the option above");
				System.out.println("-----------------------------------");

				int choice = scan.nextInt();

				switch (choice) {
					case 1:
						BookDetails books = new BookDetails();
						books.bookOption();
						break;
					case 2:
						UserClient.main(null);
						break;
					default:
						System.out.println("Invaild Choice. Please select  between options above");
				}
			}
		}
	}

}

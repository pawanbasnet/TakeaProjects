package com.takeo;

import java.util.Scanner;
import com.takeo.details.*;

public class BookApp {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			while (true) {
				System.out.println("--------");
				System.out.println("1. Books");
				System.out.println("2. exit");
				System.out.println("Please select option above");
				System.out.println("--------------------------");
				int choice = scan.nextInt();

				switch (choice) {
					case 1:
						BooksDetails books = new BooksDetails();
						books.bookMenu();
						break;
					case 2:
						System.out.println("Thank you for using the Book Management");
						System.exit(0);
						break;
					default:
						System.out.println("Invaild Choice. Please select  between options above");
				}
			}
		}
	}
}

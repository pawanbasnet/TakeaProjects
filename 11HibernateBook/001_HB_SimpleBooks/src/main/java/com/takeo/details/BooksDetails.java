package com.takeo.details;

import java.util.List;
import java.util.Scanner;

import com.takeo.BookApp;
import com.takeo.dao.BooksDao;
import com.takeo.dao.impl.BooksDaoImpl;
import com.takeo.pojo.Books;
import com.takeo.util.UtilCfg;

import org.hibernate.Session;

public class BooksDetails {
	Scanner scan = new Scanner(System.in);
	BooksDao bk = new BooksDaoImpl();

	public void bookMenu() {
		while (true) {
			System.out.println("1. Add books");
			System.out.println("2. View all books");
			System.out.println("3. Search for a book");
			System.out.println("4)Back");
			System.out.println("Please select option above");
			System.out.println("--------------------------");

			int choice = scan.nextInt();
			switch (choice) {
				case 1:
					bk.addBooks();
					break;
				case 2:
					List<Books> allBooks = bk.viewAllBooks();
					System.out.println("ID \t BookName \t Price \t Quantity");
					allBooks.stream().forEach(book -> System.out.println(book.getBookId() + "\t " + book.getName()
							+ "\t " + book.getPrice() + "\t " + book.getQuantity()));
					break;
				case 3:
					System.out.println("Please enter the book id");
					int booknum = scan.nextInt();
					Books book = bk.viewBooks(booknum);

					System.out.println("ID \t BookName \t Price \t Quantity");
					System.out.println(book.getBookId() + "\t " + book.getName() + "\t " + book.getPrice() + "\t "
							+ book.getQuantity());
					break;
				case 4:
					BookApp.main(null);
					break;
				default:
					System.out.println("Invaild Choice. Please select  between options above");
					break;
			}
		}
	}
}

package com.books.details;

import java.util.Scanner;
import com.books.dao.impl.booksDaoImpl;
import com.books.data.BookData;
import com.books.client.BookClient;

public class BookDetails {

	booksDaoImpl daoImpl = new booksDaoImpl();

	Scanner scan = new Scanner(System.in);
	// int total =

	public void bookOption() {

		while (true) {
			System.out.println("------------");
			System.out.println("1. Add books");
			System.out.println("2. View all books");
			System.out.println("3. Search for books");
			System.out.println("4. Update books");
			System.out.println("5. Remove books");
			System.out.println("6. Buy books");
			System.out.println("7. Back");

			System.out.println("Please select from the option above");
			System.out.println("-----------------------------------");

			int choice = scan.nextInt();
			switch (choice) {
				case 1:
					daoImpl.addBook();
					break;
				case 2:
					BookData[] viewallbooks = daoImpl.allBooks();
					System.out.println("BookName \t BookId \t Price \t Quantity");
					System.out.println("-------------------------------------------------");
					if (viewallbooks != null) {
						for (BookData bk : viewallbooks) {
							if (bk != null) {
								System.out.println(bk.getName() + "\t " + bk.getBookId() + "\t " + bk.getPrice() + "\t "
										+ bk.getQuantity());
							}
						}
					} else
						System.out.println("There are no books in management");
					break;
				case 3:
					System.out.println("Enter the name of book to search: ");
					String bookName = scan.next();
					daoImpl.viewbook(bookName);
					/*
					 * System.out.println("----------------------------------");
					 * if (bk != null) {
					 * System.out.println("BookName \t BookId \t Price \t Quantity");
					 * System.out.println("-------------------------------------------------");
					 * System.out.println(
					 * bk.getName() + "\t " + bk.getBookId() + "\t " + bk.getPrice() + "\t " +
					 * bk.getQuantity());
					 * } else
					 * System.out.println("Book not found");
					 */
					break;
				case 4:
					System.out.println("Enter the Id of book to update: ");
					daoImpl.updateBook(scan.nextInt());
					break;
				case 5:
					System.out.println("Enter the Id of the book to Remove: ");
					daoImpl.removeBook(scan.nextInt());
					break;
				case 6:
					System.out.println("Enter the Id of the book you  want to buy: ");
					daoImpl.buyBook(scan.nextInt());
					break;
				case 7:
					BookClient  bc = new BookClient();
					bc.bookClient();
					break;
				default:
					System.out.println("Please select one of the option above: ");
			}

		}

	}

}

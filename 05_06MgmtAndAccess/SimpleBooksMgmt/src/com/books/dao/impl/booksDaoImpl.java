package com.books.dao.impl;

import java.util.Scanner;
import com.books.data.BookData;

public class booksDaoImpl {

	Scanner scan = new Scanner(System.in);
	static BookData books[] = null; // creating a array of BookData type

	public void addBook() {

		System.out.println("How many books are you adding?");
		int size = scan.nextInt();
		books = new BookData[size];// setting the books array of BookData type to given size

		for (int i = 0; i < size; ++i) {
			System.out.println("Enter the book name: ");
			String bookName = scan.next();
			System.out.println("Enter the book Id: ");
			int bookNum = scan.nextInt();
			System.out.println("Enter the book Price: ");
			int bookPrice = scan.nextInt();

			System.out.println("Enter the quantity of books added: ");
			int bookQuan = scan.nextInt();

			// trying to check if there is already book with that book id
			/*
			 * if (books != null) {
			 * for (BookData bk : books) {
			 * if (bk.getBookId()== bookNum) {
			 * System.out.println("Book quantity is: "+bk.getQuantity());
			 * //bookQuan = bk.getQuantity() + bookQuan;
			 * }
			 * }
			 * }
			 */

			// passing the given values to BookData constructor
			BookData bk = new BookData(bookName, bookNum, bookPrice, bookQuan);
			// adding the object created to the books array
			books[i] = bk;
			System.out.println("The book added successfully!!!");
			System.out.println("------------------------------");
		}

	}

	public BookData[] allBooks() {
		return books;
	}

	public void viewbook(String book) {
		/*
		 * if (books != null) {
		 * for (BookData bk : books) {
		 * if (bk.getName().equalsIgnoreCase(book)) {
		 * return bk;
		 * }
		 * }
		 * }
		 * return null;
		 */

		int check = 0;
		if (books != null) {
			for (BookData bk : books) {
				if (bk.getName().equalsIgnoreCase(book)) {
					System.out.println("BookName \t BookId \t Price \t Quantity");
					System.out.println("-------------------------------------------------");
					System.out.println(
							bk.getName() + "\t " + bk.getBookId() + "\t " + bk.getPrice() + "\t " + bk.getQuantity());
					++check;
				}
			}
		} else {
			System.out.println("There are no books in management");
			++check;
		}
		if (check == 0)
			System.out.println("Book Not found!!!");
	}

	public void updateBook(int bookNum) {
		int check = 0;
		if (books != null) {
			for (BookData bk : books) {
				if (bk.getBookId() == bookNum) { // checking if the booknum given is equal to bookId in book object
					System.out.println("Please select what you want to update");
					System.out.println("1. Book Name \t 2. Book Price \t Book Quantity");
					System.out.println("-------------------------------------------------");
					int choice = scan.nextInt();
					switch (choice) {
						case 1:
							System.out.println("Enter Book name: ");
							String newName = scan.next();
							bk.setName(newName);
							System.out.println("Book name update successfully");
							break;
						case 2:
							System.out.println("Enter book price");
							int newPrice = scan.nextInt();
							bk.setPrice(newPrice);
							System.out.println("Book Price updated Successfully");
							break;
						case 3:
							System.out.print("Enter Book quantity");
							int newquan = scan.nextInt();
							bk.setQuantity(newquan);
							System.out.println("Quantity updated Successfully");
					}
					++check;
				}
			}
		} else {
			System.out.println("There are no books in management");
			++check;
		}
		if (check == 0)
			System.out.println("Book Not found!!!");
	}

	public void removeBook(int booknum) {
		int check = 0;
		int index = 0;
		if (books != null) {
			for (BookData bk : books) {
				if (bk.getBookId() == booknum) {
					books[index] = null;
					System.out.println("Books removed successfully");
					++check;
				}
				++index;
			}
		} else {
			System.out.println("There are no books in management");
			++check;
		}
		if (check == 0)
			System.out.println("Book not found!!!");
	}

	public void buyBook(int buyId) {
		// check if the book list is null
		// display how many of that book is there
		// ask for amount of books they want
		// calcute their price
		// subtract amount sold from total
		int check = 0;
		int total = 0;
		if (books != null) {
			for (BookData bk : books) {
				if (bk.getBookId() == buyId) {
					System.out.println("There are currently " + bk.getQuantity() + " amount of this book");
					System.out.println("Enter the quantiy of this book you would like");
					int buying = scan.nextInt();
					if (buying <= bk.getQuantity()) {
						int newquan = bk.getQuantity() - buying;
						total = bk.getPrice() * buying;
						bk.setQuantity(newquan);
						System.out.println("Your total price is $" + total);

					} else {
						System.out.println("Amount you enter is more then quantity in management");
					}
					++check;
				}
			}
		} else {
			System.out.println("There are no books in management");
			++check;
		}
		if (check == 0) {
			System.out.println("Book not found!!!");
		}
	}
}

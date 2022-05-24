package com.takeo.dao;

import java.util.List;

import com.takeo.pojo.Books;

public interface BooksDao {
	void addBooks();

	List<Books> viewAllBooks();

	Books viewBooks(int bookID);
}

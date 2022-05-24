package com.takeo.dao.impl;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;
import com.takeo.dao.BooksDao;
import com.takeo.pojo.Books;
import com.takeo.util.UtilCfg;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BooksDaoImpl implements BooksDao {
	Scanner scan = new Scanner(System.in);

	@Override
	public void addBooks() {
		Session ses = UtilCfg.getSession();
		Transaction tx = ses.beginTransaction();
		Books bk = new Books();
		System.out.println("Please enter uique book ID");
		bk.setBookId(scan.nextInt());
		System.out.println("Enter the book name: ");
		bk.setName(scan.next());
		System.out.println("Enter the book Price: ");
		bk.setPrice(scan.nextInt());
		System.out.println("Enter the quantity of books added: ");
		bk.setQuantity(scan.nextInt());

		ses.save(bk);
		tx.commit();
		System.out.println("The book added successfully!!!");
		System.out.println("------------------------------");
		UtilCfg.closeSession(ses);
	}

	@Override
	public List<Books> viewAllBooks() {
		Session ses = UtilCfg.getSession();
		Query query = ses.createQuery("from Books");
		List<Books> booksList = query.getResultList();
		UtilCfg.closeSession(ses);
		return booksList;
	}

	@Override
	public Books viewBooks(int bookNum) {
		Session ses = UtilCfg.getSession();	
		Books bk = ses.get(Books.class, bookNum);
		UtilCfg.closeSession(ses);
		return bk;	
	}

}

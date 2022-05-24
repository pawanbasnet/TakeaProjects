package com.takeo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKS")
public class Books {

	@Id
	@Column(name = "BOOKID")
	private int bookId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PRICE")
	private int price;

	@Column(name = "QUANTITY")
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Books(int bookId, String name, int price, int quantity) {
		super();
		this.name = name;
		this.bookId = bookId;
		this.price = price;
		this.quantity = quantity;
	}

	public Books() {
		super();
	}
}

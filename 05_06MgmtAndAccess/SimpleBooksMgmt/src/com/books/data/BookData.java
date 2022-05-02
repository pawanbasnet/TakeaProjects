package com.books.data;

public class BookData {
    String name;
    int bookId;
    int price;
    int quantity;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getBookId(){
        return  bookId;
    }
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public BookData(String name, int bookId, int price, int quantity){
        super();
        this.name = name;
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
    }
    public BookData(){
        super();
    }

}

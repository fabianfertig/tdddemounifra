package com.fdmgroup.tdddemouni;

import java.util.ArrayList;
import java.util.List;


public class Basket {
	// just a quick comment to show how git works
	private List<Book> booksInBasket;
	
	public Basket(){
		booksInBasket=new ArrayList<Book>();
	}
	
	public Basket(List<Book> booksInBasket){
		this.booksInBasket=booksInBasket;
	}

	public List<Book> getBooksInBasket() {
		return booksInBasket;
	}

	public void addBook(Book book) {
		booksInBasket.add(book);		
	}

}

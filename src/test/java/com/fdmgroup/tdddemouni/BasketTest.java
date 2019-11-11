package com.fdmgroup.tdddemouni;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class BasketTest {

private Basket basket;
	
	@Before
	public void init(){
		basket = new Basket(new ArrayList<Book>());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		List<Book> booksInBasket = basket.getBooksInBasket();
		assertThat(booksInBasket,is(empty()));
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		Book book = new Book(9.99);
		basket.addBook(book);
		List<Book> booksInBasket = basket.getBooksInBasket();
		assertThat(booksInBasket,hasSize(1));
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBook(){
		Book book = new Book(9.99);
		Book book2 = new Book(9.99);
		basket.addBook(book);
		basket.addBook(book2);
		List<Book> booksInBasket = basket.getBooksInBasket();
		assertThat(booksInBasket,hasSize(2));
	}

}

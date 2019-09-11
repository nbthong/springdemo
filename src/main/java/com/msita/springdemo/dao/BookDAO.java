package com.msita.springdemo.dao;

import java.util.List;

import com.msita.springdemo.model.Book;

public interface BookDAO {
	public List<Book> getBooks();
	public void createBook(Book book);
	public Book getBook(int id);
}

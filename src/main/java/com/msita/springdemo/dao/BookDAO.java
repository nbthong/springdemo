package com.msita.springdemo.dao;

import java.util.List;

import com.msita.springdemo.model.Book;

public interface BookDAO {
	public Book getBook(int id);
	public List<Book> getBooks();
	public void createBook(Book book);
	public void deleteBook(Book book);
	public void updateBook(Book book);
}

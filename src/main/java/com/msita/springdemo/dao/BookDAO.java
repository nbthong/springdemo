package com.msita.springdemo.dao;

import java.util.List;

import com.msita.springdemo.model.Book;

public interface BookDAO {
	public Book getBook(int id);
	public List<Book> getBooks();
	public void createBook(Book book);
<<<<<<< HEAD
	public void deleteBook(Book book);
	public void updateBook(Book book);
=======
	public Book getBook(int id);
>>>>>>> 929d530593738d401ced38dd8f607c8d1c063041
}

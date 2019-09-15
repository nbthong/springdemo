package com.msita.springdemo.service;

import java.util.List;

import com.msita.springdemo.model.Book;

public interface BookService {
	public List<Book> getBooks();
	public Book getBook(int id);
	public void createBook(Book book);
<<<<<<< HEAD
	public void deleteBook(int id);
	public void updateBook(Book book);
=======
>>>>>>> 929d530593738d401ced38dd8f607c8d1c063041
}

package com.msita.springdemo.service;

import java.util.List;

import com.msita.springdemo.model.Book;

public interface BookService {
	public List<Book> getBooks();
	public Book getBook(int id);
	public void createBook(Book book);
	public void deleteBook(int id);
	public void updateBook(Book book);
}

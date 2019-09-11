/**
 * 
 */
package com.msita.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msita.springdemo.dao.BookDAO;
import com.msita.springdemo.model.Book;

/**
 * @author nbthong
 *
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;
	public List<Book> getBooks() {
		return bookDAO.getBooks();
	}
	
	public Book getBook(int id) {
		return bookDAO.getBook(id);
	}
	
	public void createBook(Book book) {
		bookDAO.createBook(book);
	}
}

package com.msita.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
=======

>>>>>>> 929d530593738d401ced38dd8f607c8d1c063041

import com.msita.springdemo.model.Book;
import com.msita.springdemo.service.BookService;

@Controller
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public String hello(Model model) {
		List<Book> bookList = bookService.getBooks();
		model.addAttribute("bookList", bookList);
		return "booklist";
<<<<<<< HEAD
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createBook(Model model) {
		model.addAttribute("book",new Book());
		return "createbook";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createBookActionModel(@ModelAttribute("book") Book book) {
		bookService.createBook(book);
		return "redirect:getall";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteBook(@RequestParam("id") int id) {
		bookService.deleteBook(id);
		return "redirect:getall";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateBook(Model model, @RequestParam("id") int id) {
		Book book = bookService.getBook(id);
		model.addAttribute("book", book);
		return "updatebook";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateBookAction(@ModelAttribute("book") Book book) {
		bookService.updateBook(book);
=======
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createBook(Model model) {
		model.addAttribute("book", new Book());
		return "createbookmodel";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createBookAction(@RequestParam("name") String name, 
			@RequestParam("author") String author,
			@RequestParam("publisher") String publisher, 
			@RequestParam("price") int price) {

		Book newBook = new Book();
		newBook.setName(name);
		newBook.setAuthor(author);
		newBook.setPublisher(publisher);
		newBook.setPrice(price);

		bookService.createBook(newBook);

		return "redirect:getall";
	}
	
	@RequestMapping(value = "/createmodel", method = RequestMethod.POST)
	public String createBookActionModel(@ModelAttribute("book") Book book) {
		bookService.createBook(book);

>>>>>>> 929d530593738d401ced38dd8f607c8d1c063041
		return "redirect:getall";
	}
}

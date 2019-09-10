package com.msita.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	}
	
}

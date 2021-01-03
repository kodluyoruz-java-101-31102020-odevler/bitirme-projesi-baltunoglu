package com.mylibrary.librarymanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@Autowired
	private BookService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Book> listBook = service.listAll();
		model.addAttribute("listBook", listBook);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewBookForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		
		return "new_book";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") Book book) {
		service.save(book);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{book_id}")
	public ModelAndView showEditBookForm(@PathVariable(name = "book_id") Long book_id) {
		ModelAndView mav = new ModelAndView("edit_book");
		
		Book book = service.get(book_id);
		mav.addObject("book", book);
		
		return mav;
	}
	
	@RequestMapping("/remove/{book_id}")
	public String removeBookFromLibrary(@PathVariable(name = "book_id") Long book_id) {
		service.delete(book_id);
		
		return "redirect:/";
	}
	
}

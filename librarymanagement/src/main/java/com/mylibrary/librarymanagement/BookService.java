package com.mylibrary.librarymanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepository repo;
	
	public List<Book> listAll() {
		return repo.findAll();
	}
	
	public void save(Book book) {
		repo.save(book);
	}
	
	public Book get(Long book_id) {
		return repo.findById(book_id).get();
	}
	
	public void delete(Long book_id) {
		repo.deleteById(book_id);
	}
}
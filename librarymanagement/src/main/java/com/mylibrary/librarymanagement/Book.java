package com.mylibrary.librarymanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	private Long 	book_id;
	private String 	book_title;
	private String 	book_year;
	private String 	book_comment;
	private String 	book_author;
	private String 	book_notes;
	
	protected Book() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_year() {
		return book_year;
	}
	public void setBook_year(String book_year) {
		this.book_year = book_year;
	}
	public String getBook_comment() {
		return book_comment;
	}
	public void setBook_comment(String book_comment) {
		this.book_comment = book_comment;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_notes() {
		return book_notes;
	}
	public void setBook_notes(String book_notes) {
		this.book_notes = book_notes;
	}

}

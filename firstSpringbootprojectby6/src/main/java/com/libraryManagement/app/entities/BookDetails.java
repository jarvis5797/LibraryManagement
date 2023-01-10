package com.libraryManagement.app.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class BookDetails {
	
	@Id
	private long book_id;
	
	private long quantity;
	
	private String book_name;
	
	private String category;
	
	
	@OneToMany(targetEntity = Author.class,orphanRemoval = true,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "book_id",name = "book_id")
	private List<Author> authors;
	
	

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	
	
	
	
	

}

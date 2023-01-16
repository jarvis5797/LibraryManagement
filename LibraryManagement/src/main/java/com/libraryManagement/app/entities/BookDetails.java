package com.libraryManagement.app.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class BookDetails {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	
	private long quantity;
	
	private String bookName;
	
	private String category;
	
	
	@OneToMany(targetEntity = Author.class,orphanRemoval = true,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "bookId",name = "book_id")
	private List<Author> authors;
	
	

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
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

	@Override
	public String toString() {
		return "BookDetails [book_id=" + bookId + ", quantity=" + quantity + ", book_name=" + bookName + ", category="
				+ category + ", authors=" + authors + "]";
	}
	
	
	
	

}

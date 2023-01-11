package com.libraryManagement.app.entities;

import com.libraryManagement.app.enums.Star_Rating;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Book_Review {
	
	private String comment;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rating_id;
	
	public Book_Review() {
		
		// TODO Auto-generated constructor stub
	}

	public Book_Review(String comment, long rating_id, BookDetails bookdetails) {
		super();
		this.comment = comment;
		this.rating_id = rating_id;
		this.bookdetails = bookdetails;
	}

	

	@ManyToOne(targetEntity =BookDetails.class,cascade = CascadeType.ALL)
	@JoinColumn(name="book_id",referencedColumnName = "book_id")
	public BookDetails bookdetails;
	
	@Enumerated
	private Star_Rating star_rating;

	public Star_Rating getStar_rating() {
		return star_rating;
	}

	public void setStar_rating(Star_Rating star_rating) {
		this.star_rating = star_rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getRating_id() {
		return rating_id;
	}

	public void setRating_id(long rating_id) {
		this.rating_id = rating_id;
	}

	public BookDetails getBookdetails() {
		return bookdetails;
	}

	public void setBookdetails(BookDetails bookdetails) {
		this.bookdetails = bookdetails;
	}




}

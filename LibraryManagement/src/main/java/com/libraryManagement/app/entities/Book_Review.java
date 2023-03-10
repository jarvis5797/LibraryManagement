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
	private long ratingId;
	
	public Book_Review() {
		
		// TODO Auto-generated constructor stub
	}

	public Book_Review(String comment, long rating_id, BookDetails bookdetails) {
		super();
		this.comment = comment;
		this.ratingId = rating_id;
		this.bookdetails = bookdetails;
	}

	

	@ManyToOne(targetEntity =BookDetails.class,cascade = CascadeType.ALL)
	@JoinColumn(name="book_id",referencedColumnName = "bookId")
	public BookDetails bookdetails;
	
	@Enumerated
	private Star_Rating starRating;



	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getRatingId() {
		return ratingId;
	}

	public void setRatingId(long ratingId) {
		this.ratingId = ratingId;
	}

	public BookDetails getBookdetails() {
		return bookdetails;
	}

	public void setBookdetails(BookDetails bookdetails) {
		this.bookdetails = bookdetails;
	}

	public Star_Rating getStarRating() {
		return starRating;
	}

	public void setStarRating(Star_Rating starRating) {
		this.starRating = starRating;
	}

	@Override
	public String toString() {
		return "Book_Review [comment=" + comment + ", ratingId=" + ratingId + ", bookdetails=" + bookdetails
				+ ", starRating=" + starRating + "]";
	}
	
	




}

package com.libraryManagement.app.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.util.Date;

@Entity
public class  IssueDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long issueId;
	private Date issueDate;
	
	
	@ManyToOne(targetEntity = BookDetails.class,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "bookId",name="book_id")
	private BookDetails book;
	
	@ManyToOne(targetEntity = UserDetails.class,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "userId",name = "user_id")
	private UserDetails user;
	
	private Date issueEndDate;
	private Date return_date;
	
	
	
	public long getIssueId() {
		return issueId;
	}
	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public BookDetails getBook() {
		return book;
	}
	public void setBook(BookDetails book) {
		this.book = book;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public Date getIssueEndDate() {
		return issueEndDate;
	}
	public void setIssueEndDate(Date issueEndDate) {
		this.issueEndDate = issueEndDate;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public IssueDetails(long issue_id, Date issue_date, BookDetails book_id, UserDetails user_id, Date issue_endDate,
			Date return_date) {
		super();
		this.issueId = issue_id;
		this.issueDate = issue_date;
		this.book = book_id;
		this.user = user_id;
		this.issueEndDate = issue_endDate;
		this.return_date = return_date;
	}
	public IssueDetails() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IssueDetails [issue_id=" + issueId + ", issue_date=" + issueDate + ", book_id=" + book
				+ ", user_id=" + user + ", issue_endDate=" + issueEndDate + ", return_date=" + return_date + "]";
	}
	
	
	
	
	

}

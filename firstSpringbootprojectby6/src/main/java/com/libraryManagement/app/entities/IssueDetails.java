package com.libraryManagement.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class  IssueDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long issue_id;
	private Date issue_date;
	private long book_id;
	private long user_id;
	private Date issue_endDate;
	private Date return_date;
	
	public IssueDetails() {
		super();
		}
	
	public IssueDetails(long issue_id, Date issue_date, long book_id, long user_id, Date issue_endDate,
			Date return_date) {
		super();
		this.issue_id = issue_id;
		this.issue_date = issue_date;
		this.book_id = book_id;
		this.user_id = user_id;
		this.issue_endDate = issue_endDate;
		this.return_date = return_date;
	}
	
	public long getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(long issue_id) {
		this.issue_id = issue_id;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public long getBook_id() {
		return book_id;
	}
	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public Date getIssue_endDate() {
		return issue_endDate;
	}
	public void setIssue_endDate(Date issue_endDate) {
		this.issue_endDate = issue_endDate;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	
	

}

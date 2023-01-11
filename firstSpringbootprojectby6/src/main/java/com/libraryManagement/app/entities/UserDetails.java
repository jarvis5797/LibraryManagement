package com.libraryManagement.app.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class  UserDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	private String user_name;
	private long lend_count;
	private String user_email;
	private boolean isAdmin;
	
	
	public UserDetails() {
		super();
		
	}
	
	public UserDetails(long user_id, String user_name, long lend_count, String user_email, boolean isAdmin) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.lend_count = lend_count;
		this.user_email = user_email;
		this.isAdmin = isAdmin;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public long getLend_count() {
		return lend_count;
	}
	public void setLend_count(long lend_count) {
		this.lend_count = lend_count;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public boolean isAdmin(){
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	//bidirectional purpose
//	@OneToMany(mappedBy = "user_id")
//	public List<IssueDetails> issuedetails;
//
//
//	public List<IssueDetails> getIssuedetails() {
//		return issuedetails;
//	}
//
//	public void setIssuedetails(List<IssueDetails> issuedetails) {
//		this.issuedetails = issuedetails;
//	}
	
	
}

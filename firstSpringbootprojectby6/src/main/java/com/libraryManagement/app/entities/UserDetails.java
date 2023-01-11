package com.libraryManagement.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String userName;
	private long lendCount;
	private String userEmail;
	private boolean isAdmin;

	public UserDetails() {
		super();

	}

	public UserDetails(long user_id, String user_name, long lend_count, String user_email, boolean isAdmin) {
		super();
		this.userId = user_id;
		this.userName = user_name;
		this.lendCount = lend_count;
		this.userEmail = user_email;
		this.isAdmin = isAdmin;
	}

	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getLendCount() {
		return lendCount;
	}

	public void setLendCount(long lendCount) {
		this.lendCount = lendCount;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "UserDetails [user_id=" + userId + ", user_name=" + userName + ", lend_count=" + lendCount
				+ ", user_email=" + userEmail + ", isAdmin=" + isAdmin + "]";
	}

	// bidirectional purpose
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

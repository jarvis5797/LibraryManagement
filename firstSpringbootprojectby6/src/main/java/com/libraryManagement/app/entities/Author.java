package com.libraryManagement.app.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Author {
	
	@Id
	private long author_id;
	
	private String author_name;

	public Author() {
		
		// TODO Auto-generated constructor stub
	}

	public Author(long author_id, String author_name) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author_id, author_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return author_id == other.author_id && Objects.equals(author_name, other.author_name);
	}

	public long getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(long author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	
	

	
}

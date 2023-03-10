package com.libraryManagement.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libraryManagement.app.entities.BookDetails;

public interface BookRepository extends JpaRepository<BookDetails,Long> {
	
	public List<BookDetails> findBycategory(String category);
	
	public List<BookDetails> findBybookName(String name);
	
	
	
}

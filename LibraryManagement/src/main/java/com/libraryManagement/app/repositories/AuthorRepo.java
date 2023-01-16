package com.libraryManagement.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryManagement.app.entities.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

	
	public List<Author> findByAuthorName(String name);
	
}

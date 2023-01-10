package com.libraryManagement.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libraryManagement.app.entities.Author;

public interface AuthorRepo extends JpaRepository<Author, Long> {

}

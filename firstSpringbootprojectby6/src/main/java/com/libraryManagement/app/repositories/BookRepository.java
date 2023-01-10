package com.libraryManagement.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libraryManagement.app.entities.BookDetails;

public interface BookRepository extends JpaRepository<BookDetails,Long> {

}

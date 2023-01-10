package com.libraryManagement.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libraryManagement.app.entities.Book_Review;

public interface ReviewRepo extends JpaRepository<Book_Review, Long> {

}

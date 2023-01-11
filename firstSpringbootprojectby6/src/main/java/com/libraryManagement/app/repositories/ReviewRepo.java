package com.libraryManagement.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryManagement.app.entities.Book_Review;


@Repository
public interface ReviewRepo extends JpaRepository<Book_Review, Long> {

}

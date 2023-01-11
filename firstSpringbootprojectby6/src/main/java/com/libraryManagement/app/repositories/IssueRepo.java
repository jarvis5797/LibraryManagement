package com.libraryManagement.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryManagement.app.entities.IssueDetails;

@Repository
public interface IssueRepo extends JpaRepository<IssueDetails, Long> {

}

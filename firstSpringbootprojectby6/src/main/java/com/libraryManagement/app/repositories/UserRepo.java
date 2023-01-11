package com.libraryManagement.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libraryManagement.app.entities.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails,Long> {

}

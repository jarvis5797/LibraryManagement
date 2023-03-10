package com.libraryManagement.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.libraryManagement.app.entities.BookDetails;
import com.libraryManagement.app.exception.BookNotfoundException;

@Service
public interface BookDetailsService {

	

	public List<BookDetails> getallbookdetails();

	public BookDetails addbookdetails(BookDetails bookDetails);

	public List<BookDetails> getbookdetailsbycategory(String category);

	public BookDetails deletebookdetailsbyid(long id) throws BookNotfoundException;

	public List<BookDetails> getbookdetailsbytitle(String title);
	
}

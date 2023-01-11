package com.libraryManagement.app.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagement.app.entities.BookDetails;
import com.libraryManagement.app.exception.BookNotfoundException;
import com.libraryManagement.app.repositories.BookRepository;
import com.libraryManagement.app.services.BookDetailsService;

@Service
public class BookDetailsServiceImpl implements BookDetailsService {
	
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookDetailsServiceImpl(BookRepository bookRepository){
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public List<BookDetails> getallbookdetails() {
		// TODO Auto-generated method stub
		System.out.println("service method is called");
		return bookRepository.findAll();
	}

	@Override
	public BookDetails addbookdetails(BookDetails bookDetails) {
		// TODO Auto-generated method stub
		bookRepository.save(bookDetails);
		return bookDetails;
	}

	@Override
	public List<BookDetails> getbookdetailsbycategory(String category) {
		// TODO Auto-generated method stub
		System.out.println(bookRepository.findBycategory(category));
		return bookRepository.findBycategory(category);
	}

	@Override
	public BookDetails deletebookdetailsbyid(long id) throws BookNotfoundException {
		// TODO Auto-generated method stub
		BookDetails bookDetails=bookRepository.findById(id).orElse(null);
		if(bookDetails!=null){
			System.out.println(bookDetails);
			bookRepository.deleteById(id);
			return bookDetails;
		}
		
		else {
			throw new BookNotfoundException("book was not found");
			//System.out.println("else part is executed");
			//return null;
		}
		
		
		
	
		
	}

	@Override
	public List<BookDetails> getbookdetailsbytitle(String title) {
		// TODO Auto-generated method stub
		System.out.println(bookRepository.findBybookName(title));
		return bookRepository.findBybookName(title);
	}

	

}

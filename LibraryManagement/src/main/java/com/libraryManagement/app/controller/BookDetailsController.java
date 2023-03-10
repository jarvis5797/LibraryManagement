package com.libraryManagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagement.app.entities.BookDetails;
import com.libraryManagement.app.exception.BookNotfoundException;
import com.libraryManagement.app.services.BookDetailsService;

@RestController
public class BookDetailsController {

	
	private BookDetailsService bookDetailsService;

	@Autowired
	public BookDetailsController(BookDetailsService bookDetailsService) {
		this.bookDetailsService = bookDetailsService;
	}

	public BookDetailsController(){
		
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/getBooks")
	public List<BookDetails> getallbookdetails(){
		return bookDetailsService.getallbookdetails();
	}
	
	
	
	@GetMapping("/getbook/{category}")
	public List<BookDetails> getbookdetailsbycategory(@PathVariable("category") String category){
		return bookDetailsService.getbookdetailsbycategory(category);
		
	}
	@GetMapping("/getbookbytitle/{title}")
	public List<BookDetails> getbookdetailsbytitle(@PathVariable("title") String title){
		return bookDetailsService.getbookdetailsbytitle(title);
		
	}
//	@GetMapping("/getbookbyauthor/{name}")
//	public List<BookDetails> getbookdetailsbycategory(@PathVariable("category") String category){
//		return bookDetailsService.getbookdetailsbycategory(category);
//		
//	}
	
	@DeleteMapping("/deletebookdetails/{id}")
	public BookDetails deletebookdetailsbyid(@PathVariable("id") long id) throws BookNotfoundException{
		System.out.println(id);
		return bookDetailsService.deletebookdetailsbyid(id);
		
	}
	
	
	@PostMapping("/addbookDetails")
	public BookDetails addbookdetails(@RequestBody BookDetails bookDetails) {
		return bookDetailsService.addbookdetails(bookDetails);
	}
	
	
	
	
	
	
	
	
	
	
	

}

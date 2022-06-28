package com.learn.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.project.model.Books;
import com.learn.project.repository.Booksrepository;

@Service
public class Booksservice {
	@Autowired
	Booksrepository bookRepo;
	public void addBook(Books book) {
		bookRepo.save(book);
	}
	public List<Books> getall() {
		return bookRepo.findAll();		
	}
	public void deleteBook(int id) {
	bookRepo.delete(Books.builder().id(id).build());
	}
}
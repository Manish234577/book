package com.learn.project.contoller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.learn.project.model.Books;
import com.learn.project.service.Booksservice;

import lombok.Builder;

@RestController
public class Bookscontroller {
	@Autowired
	Booksservice bookservice;
	@GetMapping("/")
	public String home() {
		return "book service home page";
	}
	
	@GetMapping("/addbooks")
	public String addBook(int id, String name, String author) {
		bookservice.addBook(Books.builder().id(id).name(name).author(author).build());
		return "books are added";
		
	}
	@GetMapping("/getbooks")
	public String getall() {
		Gson gson=new Gson();
		String json=gson.toJson(bookservice.getall());
		return json;
	}
	@GetMapping("/deletebook")
	public String deletebooks(int id) {
		bookservice.deleteBook(id);
		return "boook is deleted";
	}
	
}

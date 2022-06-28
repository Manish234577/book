package com.learn.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.project.model.Books;

public interface Booksrepository extends JpaRepository<Books, Integer> {

}

package com.tistory.redcrow.springboot.service;

import java.util.Optional;

import com.tistory.redcrow.springboot.domain.Book;

public interface BookService {
	
	Optional<Book> findById(Long id);	

}


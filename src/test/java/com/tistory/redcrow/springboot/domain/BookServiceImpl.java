package com.tistory.redcrow.springboot.domain;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.tistory.redcrow.springboot.domain.Book;
import com.tistory.redcrow.springboot.domain.BookRepository;
import com.tistory.redcrow.springboot.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

}

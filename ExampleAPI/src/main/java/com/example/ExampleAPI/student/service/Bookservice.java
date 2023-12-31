package com.example.ExampleAPI.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExampleAPI.student.model.Book;
import com.example.ExampleAPI.student.respository.BookRepository;
@Service
public class Bookservice implements IBook{

	@Autowired
	BookRepository bookRepository;
	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book findById(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

	@Override
	public Book findByStudentId(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findByStudentId(id);
	}

	@Override
	public Book findBookNameContaining(String bookname) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookNameContaining(bookname);
	}

	@Override
	public Book save(Book std) {
		// TODO Auto-generated method stub
		return bookRepository.save(std);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

}

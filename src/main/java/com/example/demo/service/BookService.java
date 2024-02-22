package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    //Insert a book into our h2-database
    //Dependency Injection: DI is a design pattern used in software engineering
    //to achieve inversion of control between classes and their dependencies or connections
    //Goal: it allows for decoupling components by making them independent of the
    // concrete implementations of classes that they rely on
    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);
    }
    @Transactional
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
//    @Autowired // This tells spring to inject an instance of BookRepository into BookService
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;
//    } //In this example, BookService depends on BookRepository
    // to access and manipulate the book object data
}

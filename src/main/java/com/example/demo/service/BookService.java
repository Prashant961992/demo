package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book findBookById(String id) {
        return repository.findById(id).orElse(new Book());
    }

    public Book saveBook(Book superHero) {
        return repository.save(superHero);
        
    }

    public Book updateBook(Book superHero) {
        return repository.save(superHero);
    }

    public void deleteBook(String id) {
        repository.findById(id).ifPresent(superHero -> repository.delete(superHero));
    }
}
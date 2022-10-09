package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.example.demo.models.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<Book> list = bookService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Book superHero = bookService.findBookById(id);
        return ResponseEntity.ok().body(superHero);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Book superHero) {
        Book savedSuperHero = bookService.saveBook(superHero);
        return ResponseEntity.ok().body(savedSuperHero);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Book superHero, @PathVariable String id) {
        superHero.setId(id);
        Book updatedSuperHero = bookService.updateBook(superHero);
        return ResponseEntity.ok().body(updatedSuperHero);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }
}
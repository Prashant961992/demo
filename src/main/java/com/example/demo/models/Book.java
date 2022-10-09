package com.example.demo.models;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private String id;
    private String isbn13;
    private String title;
    private int pages;
    // private Publisher publisher;
}


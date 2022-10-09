package com.example.demo.models;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

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

    @ReadOnlyProperty
    @DocumentReference(lookup="{'book':?#{#self._id} }")
    private Publisher publisher;
}


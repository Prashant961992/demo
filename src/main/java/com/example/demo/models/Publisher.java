/**
 * 
 */
package com.example.demo.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

// import org.springframework.data.mongodb.core.mapping.DBRef;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {
    @Id
    private String id;
    
    private String name;
    private String arconym;
    private int foundationYear;

    @ReadOnlyProperty
    @DocumentReference(lookup="{'publisher':?#{#self._id} }")
    private List<Book> books;
}

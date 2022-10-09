/**
 * 
 */
package com.example.demo.models;

// import org.springframework.data.mongodb.core.mapping.DBRef;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {
    private String name;
    private String arconym;
    private int foundationYear;
    // @DBRef
    // List<Book> books;
}

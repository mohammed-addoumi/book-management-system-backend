package com.mytech.bookmanagementsystembackend.book;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
@CrossOrigin("*")
public class BookController {

    @GetMapping
    public List<BookDto> getAllBooks() {
        List<BookDto> sampleBooks = new ArrayList<>();
        sampleBooks.add(new BookDto(1L, "The Great Gatsby", "F. Scott Fitzgerald", 180, "978-0743273565"));
        sampleBooks.add(new BookDto(2L, "To Kill a Mockingbird", "Harper Lee", 281, "978-0061120084"));
        sampleBooks.add(new BookDto(3L, "1984", "George Orwell", 328, "978-0451524935"));
        sampleBooks.add(new BookDto(4L, "Pride and Prejudice", "Jane Austen", 279, "978-1503280780"));
        sampleBooks.add(new BookDto(5L, "The Catcher in the Rye", "J.D. Salinger", 220, "978-0316769488"));
        return sampleBooks;
    }
}

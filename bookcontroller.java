package com.bookstore.controller;

import com.bookstore.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class BookController {

    List<Book> books = new ArrayList<>();

    public BookController() {

        books.add(new Book(1, "Java Basics", "James", 500));
        books.add(new Book(2, "Spring Boot", "John", 700));
        books.add(new Book(3, "Web Development", "David", 650));
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return books;
    }
}
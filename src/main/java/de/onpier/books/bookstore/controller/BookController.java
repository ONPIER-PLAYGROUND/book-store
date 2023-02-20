package de.onpier.books.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/books")
public interface BookController {

    @GetMapping(value = "/book/all")
    List<Book> getAllBooks();

    @GetMapping(value = "/book/fantasy")
    List<Book> getFantasyBooks();

    @GetMapping(value = "/book/adventure")
    List<Book> getAdventureBooks();

    @GetMapping(value = "/book/travel")
    List<Book> getTravelBooks();


}

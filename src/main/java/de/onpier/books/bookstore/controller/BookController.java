package de.onpier.books.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RequestMapping("/api/book")
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

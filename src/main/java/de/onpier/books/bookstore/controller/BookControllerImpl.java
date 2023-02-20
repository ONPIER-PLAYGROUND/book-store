package de.onpier.books.bookstore.controller;

import de.onpier.books.bookstore.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookControllerImpl implements BookController {

    private final BookService bookService;

    public BookControllerImpl(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public List<Book> getFantasyBooks() {
        return bookService.getFantasyBooks();
    }

    public List<Book> getAdventureBooks() {
        return bookService.getAdventureBooks();
    }

    public List<Book> getTravelBooks() {
        return bookService.getTravelBooks();
    }


}

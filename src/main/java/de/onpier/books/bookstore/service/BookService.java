package de.onpier.books.bookstore.service;

import de.onpier.books.bookstore.controller.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    List<Book> getFantasyBooks();
    List<Book> getAdventureBooks();
    List<Book> getTravelBooks();
    boolean orderBook(String bookId, UserAddress userAddress);
}

package de.onpier.books.bookstore.client.impl;

import de.onpier.books.bookstore.client.AdventureBook;
import de.onpier.books.bookstore.client.AdventureProviderApi;
import de.onpier.books.bookstore.client.Author;
import de.onpier.books.bookstore.client.BookNotAvailableException;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Component
public class AdventureProviderApiImpl implements AdventureProviderApi {
    private final AdventureBook book1 = new AdventureBook(
            UUID.randomUUID().toString(),
            Author.builder().firstName("Miguel").lastName("Cervantes").build(),
            "Don Quixote",
            new BigDecimal("12.90"));

    private final AdventureBook book2 = new AdventureBook(
            UUID.randomUUID().toString(),
            Author.builder().firstName("Jules").lastName("Verne").build(),
            "Around the World in Eighty Days",
            new BigDecimal("12.90"));


    private final List<AdventureBook> books = List.of(
            book1, book2
    );

    @Override
    public List<AdventureBook> getBooks() {
        return books;
    }

    @Override
    public void orderBook(String bookId) throws BookNotAvailableException {
        if (books.get(0).getBookId().equals(bookId)) {
            throw new BookNotAvailableException();
        }
    }
}

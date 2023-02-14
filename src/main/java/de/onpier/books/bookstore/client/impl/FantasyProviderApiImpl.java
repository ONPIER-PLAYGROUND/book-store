package de.onpier.books.bookstore.client.impl;

import de.onpier.books.bookstore.client.Author;
import de.onpier.books.bookstore.client.BookNotAvailableException;
import de.onpier.books.bookstore.client.FantasyBook;
import de.onpier.books.bookstore.client.FantasyProviderApi;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Component
public class FantasyProviderApiImpl implements FantasyProviderApi {
    private final FantasyBook book1 = new FantasyBook(
            UUID.randomUUID().toString(),
            Author.builder().firstName("J.R.R").lastName("Tolkien").build(),
            "The Lord of the Rings: Special Edition",
            new BigDecimal("129"));

    private final FantasyBook book2 = new FantasyBook(
            UUID.randomUUID().toString(),
            Author.builder().firstName("J.R.R").lastName("Tolkien").build(),
            "The Hobbit And The Lord Of The Rings: Deluxe Pocket Boxed Set)",
            new BigDecimal("34.80"));


    private final List<FantasyBook> books = List.of(
            book1, book2
    );

    @Override
    public List<FantasyBook> getBooks() {
        return books;
    }

    @Override
    public void orderBook(String bookId) throws BookNotAvailableException {
        if (books.get(0).getBookId().equals(bookId)) {
            throw new BookNotAvailableException();
        }
    }
}

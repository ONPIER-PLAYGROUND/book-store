package de.onpier.books.bookstore.client.impl;

import de.onpier.books.bookstore.client.Author;
import de.onpier.books.bookstore.client.BookNotAvailableException;
import de.onpier.books.bookstore.client.TravelBook;
import de.onpier.books.bookstore.client.TravelProviderApi;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Component
public class TravelProviderApiImpl implements TravelProviderApi {

    private final TravelBook book1 = new TravelBook(
            UUID.randomUUID().toString(),
            Author.builder().firstName("W.G.").lastName("Sebald").build(),
            "The Rings of Saturn",
            new BigDecimal("25.95"));

    private final TravelBook book2 = new TravelBook(
            UUID.randomUUID().toString(),
            Author.builder().firstName("Don").lastName("George").build(),
            "A Moveable Feast (Lonely Planet Travel Literature)",
            new BigDecimal("14.95"));


    private final List<TravelBook> books = List.of(
            book1, book2
    );

    @Override
    public List<TravelBook> getBooks() {
        return books;
    }

    @Override
    public void orderBook(String bookId) throws BookNotAvailableException {
        if (books.get(0).getBookId().equals(bookId)) {
            throw new BookNotAvailableException();
        }
    }
}

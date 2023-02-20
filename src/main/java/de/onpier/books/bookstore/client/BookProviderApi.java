package de.onpier.books.bookstore.client;

public interface BookProviderApi {
    void orderBook(String bookId) throws BookNotAvailableException;
}

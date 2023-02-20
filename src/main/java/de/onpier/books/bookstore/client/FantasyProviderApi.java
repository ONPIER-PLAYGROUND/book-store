package de.onpier.books.bookstore.client;

import java.util.List;

public interface FantasyProviderApi extends BookProviderApi {
    List<FantasyBook> getBooks();
}

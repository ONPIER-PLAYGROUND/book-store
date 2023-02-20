package de.onpier.books.bookstore.client;

import java.util.List;

public interface AdventureProviderApi extends BookProviderApi {

    List<AdventureBook> getBooks();
}

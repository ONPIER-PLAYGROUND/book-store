package de.onpier.books.bookstore.client;

import java.util.List;

public interface TravelProviderApi extends BookProviderApi {

    List<TravelBook> getBooks();
}

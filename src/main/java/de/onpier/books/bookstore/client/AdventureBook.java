package de.onpier.books.bookstore.client;

import de.onpier.books.bookstore.repository.CommissionEntity;

import java.math.BigDecimal;

public class AdventureBook extends IBook {

    public AdventureBook(String bookId, Author author, String title, BigDecimal price) {
        super(bookId, author, title, price);
    }

    @Override
    public CommissionEntity getCommission() {
        return new CommissionEntity(getBookId(), getPrice().divide(new BigDecimal("10")));
    }
}

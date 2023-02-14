package de.onpier.books.bookstore.client;

import de.onpier.books.bookstore.repository.CommissionEntity;

import java.math.BigDecimal;

public class FantasyBook extends IBook {

    public FantasyBook(String bookId, Author author, String title, BigDecimal price) {
        super(bookId, author, title, price);
    }

    @Override
    public CommissionEntity getCommission() {
        return new CommissionEntity(getBookId(), getPrice().divide(new BigDecimal("5")));
    }
}

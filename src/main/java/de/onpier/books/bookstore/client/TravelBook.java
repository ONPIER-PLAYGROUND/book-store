package de.onpier.books.bookstore.client;

import de.onpier.books.bookstore.repository.CommissionEntity;
import lombok.Builder;

import java.math.BigDecimal;

public class TravelBook extends IBook {

    public TravelBook(String bookId, Author author, String title, BigDecimal price) {
        super(bookId, author, title, price);
    }

    @Override
    public CommissionEntity getCommission() {
        return new CommissionEntity(getBookId(), getPrice().divide(new BigDecimal("5")));
    }
}

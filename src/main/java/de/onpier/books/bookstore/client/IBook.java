package de.onpier.books.bookstore.client;

import de.onpier.books.bookstore.repository.CommissionEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public abstract class IBook {
    private String bookId;
    private Author author;
    private String title;
    private BigDecimal price;

    public abstract CommissionEntity getCommission();

    public IBook bookId(String bookId) {
        this.bookId = bookId;
        return this;
    }
}

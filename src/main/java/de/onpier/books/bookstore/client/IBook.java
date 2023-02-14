package de.onpier.books.bookstore.client;

import de.onpier.books.bookstore.repository.CommissionEntity;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Data
@Builder
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

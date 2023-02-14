package de.onpier.books.bookstore.repository;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class CommissionEntity {
    private String id = UUID.randomUUID().toString();
    private String bookId;
    private LocalDateTime createdAt = LocalDateTime.now();
    private BigDecimal value;

    public CommissionEntity(String bookId, BigDecimal value) {
        this.bookId = bookId;
        this.value = value;
    }
}

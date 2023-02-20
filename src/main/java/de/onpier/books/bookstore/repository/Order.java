package de.onpier.books.bookstore.repository;

import de.onpier.books.bookstore.service.UserAddress;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Order {
    private String id = UUID.randomUUID().toString();
    private UserAddress userAddress;
    private String bookId;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Order(UserAddress userAddress, String bookId) {
        this.userAddress = userAddress;
        this.bookId = bookId;
    }
}

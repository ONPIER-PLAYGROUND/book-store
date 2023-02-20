package de.onpier.books.bookstore.controller;

import de.onpier.books.bookstore.service.UserAddress;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Order {
    private String bookId;
    private UserAddress userAddress;
}

package de.onpier.books.bookstore.controller;

import de.onpier.books.bookstore.client.Author;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Book {
    private String id;
    private Author author;
    private String title;
    private BigDecimal price;
}

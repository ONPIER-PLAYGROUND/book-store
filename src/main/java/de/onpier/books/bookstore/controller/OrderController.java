package de.onpier.books.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/book")
public interface OrderController {

    @PutMapping(value = "/order-book")
    ResponseEntity<?> orderBook(Order order);
}
